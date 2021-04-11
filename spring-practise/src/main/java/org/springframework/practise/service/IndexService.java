package org.springframework.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {

	@Autowired
	private UserService userService;

	public IndexService() {
		System.out.println("IndexService 初始化");
	}
}
