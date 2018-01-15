package com.suke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suke.service.HeloService;

@RestController
public class HelloController {
	@Autowired
	HeloService helloService;
	@RequestMapping(value="/hi")
	public String hello(@RequestParam String name) {
		return helloService.hello(name);
		
	}
}
