package com.cloudaxis.test;

import org.junit.Test;

import com.cloudaxis.demo.Demo;

public class DemoTest {

	@Test
	public void test1(){
		
		String str = new Demo().test();
		System.out.println(str);
	}
	
}
