package org.springframework.practise;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.practise.config.Config;

public class UserTest {

	@Test
	public void userTest(){


		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);



	}


}
