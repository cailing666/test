package com.zpy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.shitilei.Customer;

public interface CustomerService extends IService<Customer> {
    boolean login(String userName, String userPwd);
}
