package com.bhanu.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootcoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootcoreApplication.class, args);
	    basic obj=context.getBean("bhanu",basic.class);
	    obj.testing();
	    obj.getObj().automationtesting();

	}
}
