package com.ankit.firstspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor,ApplicationContextAware{

	ApplicationContext applicationContext = null; 
	
	public DisplayNameBeanPostProcessor() {

		System.out.println("Inside empty constructor DisplayNameBeanPostProcessor");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("Inside postProcess BEFORE Initialization for bean " + beanName);
		if(beanName.equals("firstPoint"))
		{
			bean = applicationContext.getBean("secondPoint");
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("Inside postProcess AFTER Initialization for bean " + beanName);
		return bean;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("Inside setApplicationContext of DisplayNameBeanPostProcessor");
		this.applicationContext = applicationContext;
	}


}
