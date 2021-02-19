package com.zc.project.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MybatisApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
