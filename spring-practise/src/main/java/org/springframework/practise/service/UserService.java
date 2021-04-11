package org.springframework.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	// @Autowired
	// private IndexService indexService;

	public UserService() {
		System.out.println("UserService 初始化完成");
	}
}
