package org.springframework.practise.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author zzwen6
 * @date 2021/4/12 16:23
 */
@Component
public class BeanPostProcessorExt implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println("BeanPostProcessorExt--postProcessBeforeInitialization");
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println("BeanPostProcessorExt--postProcessAfterInitialization");
		}
		return bean;
	}
}
