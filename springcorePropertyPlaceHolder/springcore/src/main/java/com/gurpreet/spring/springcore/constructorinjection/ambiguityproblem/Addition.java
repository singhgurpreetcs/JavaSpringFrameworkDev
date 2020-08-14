package com.gurpreet.spring.springcore.constructorinjection.ambiguityproblem;

public class Addition {
	Addition(int a, int b) {
		System.out.println("Inside INT");
	}

	Addition(double a, double b) {
		System.out.println("Inside Double");
	}

	Addition(String a, String b) {
		System.out.println("Inside String");
	}

}
