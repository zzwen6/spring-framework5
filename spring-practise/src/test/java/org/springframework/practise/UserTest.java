package org.springframework.practise;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	@Test
	public void userTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:user.xml");

		User bean = applicationContext.getBean(User.class);

		System.out.println(bean.toString());


	}


}
