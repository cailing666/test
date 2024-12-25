package com.zpy.shitilei;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("food")
public class Food {
    @TableId
    private Integer id;
    private String foodName;
    private String store;
    private Double price;
    private Integer stock;
    private String fimage;
    private String descr;
    private Integer status;
    
}
