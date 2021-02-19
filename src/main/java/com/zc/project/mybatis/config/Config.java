package com.zc.project.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author CoreyChen Zhang
 * @version 2021/2/2 16:34
 * @modified
 */
@MapperScan(basePackages = "com.zc.project.mybatis.mapper")
@ComponentScan(basePackages = "com.zc.project.mybatis")
public class Config {
}
