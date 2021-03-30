package org.springframework.practise.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	public UserService() {
		System.out.println("UserService 初始化完成");
	}
}
