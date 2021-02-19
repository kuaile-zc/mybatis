package com.zc.project.mybatis.controller;

import com.zc.project.mybatis.mapper.TestMapper;
import com.zc.project.mybatis.model.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CoreyChen Zhang
 * @version 2020/11/27 18:41
 * @modified
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("test")
public class Hello {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/hello")
    public Object hello(){
        Test test = testMapper.selectById(1);
        return test;
    }

    @GetMapping("/redis/{object}")
    public Object redis(@PathVariable("object") String o){
        redisTemplate.opsForValue().set(o,"1000");
        String i = redisTemplate.opsForValue().get(o);
//        int ret = (int) i;
        return i;
    }


}
