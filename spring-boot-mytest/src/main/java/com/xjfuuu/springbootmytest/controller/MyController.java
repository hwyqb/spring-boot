package com.xjfuuu.springbootmytest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/test")
	public String test(){
		System.out.println("访问test,hello world");
		return "访问test,hello world";
	}

}
