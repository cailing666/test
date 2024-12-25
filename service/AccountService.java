package com.zpy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.shitilei.User;

public interface AccountService extends IService<User> {
    boolean login(String user,String password);

}
