package com.suke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suke.service.SchedualServiceHi;

@RestController
public class HiController {
	@Autowired
	SchedualServiceHi schenalsh;
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		return schenalsh.sayHiFromClientOne(name);
	}
} 
