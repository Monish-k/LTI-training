package com.lti.MavenDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDemo {
	
	@Test
	void strcheck() {
		String s="demo";
		System.out.println("String check");
		assertEquals("demo",s);
	}
	
}
