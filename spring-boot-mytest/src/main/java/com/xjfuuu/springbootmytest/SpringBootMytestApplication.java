package com.xjfuuu.springbootmytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//标明改类是一个Spring Boot应用(其实是一个组合注解)
@SpringBootApplication
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		//Spring 应用启动器执行run方法
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
