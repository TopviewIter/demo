package com.zluo.quartz.service;

import org.springframework.stereotype.Service;

@Service
public class JobService {

	public void work(){
		System.out.println("service work");
	}
	
}
