package com.qa.maven;

import org.testng.annotations.Test;

public class MavenTest {

	
	
	@Test(priority=1)
	public void test(){
		String name="Rehan Abrahim";
		System.out.println("Your name is\n"+name);
		System.out.println("---------------------------------------");
	}
	
	@Test(priority=2)
	public void test1(){
		String name="Saquib Abrahim";
		System.out.println("Your name is\n"+name);
		System.out.println("---------------------------------------");
	}
	public static void main(String[] args) {
		
		
		String name="Rehan Abrahim";
		System.out.println("Your name is\n"+name);

	}

	
}
