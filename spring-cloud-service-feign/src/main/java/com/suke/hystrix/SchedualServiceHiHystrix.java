package com.suke.hystrix;

import org.springframework.stereotype.Component;

import com.suke.service.SchedualServiceHi;
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "sorry,"+name;
	}

}
