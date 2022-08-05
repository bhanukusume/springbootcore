package com.bhanu.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bhanu")
public class basic {
	@Autowired
	@Qualifier("bhanu1")
	basic1 obj;
	public basic1 getObj() {
		return obj;
	}
	public void setObj(basic1 obj) {
		this.obj = obj;
	}
	public void testing() {
		System.out.println("basic object created");
	}

}
