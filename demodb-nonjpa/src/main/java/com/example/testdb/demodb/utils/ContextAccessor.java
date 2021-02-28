package com.example.testdb.demodb.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ContextAccessor {

	private static ContextAccessor instance;

	@Autowired
	private ApplicationContext applicationContext;

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<?> clazz) {
		return (T) instance.applicationContext.getBean(clazz);
	}

	@PostConstruct
	private void registerInstance() {
		instance = this;
	}

	public static Resource getClasspathResource(String resource) {
		return instance.applicationContext.getResource(resource);
	}
}