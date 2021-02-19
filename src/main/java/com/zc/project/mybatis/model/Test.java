package com.zc.project.mybatis.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author CoreyChen Zhang
 * @version 2021/2/2 16:31
 * @modified
 */
@Data
@TableName("test")
public class Test {

    private int id;
    private String name;
}
