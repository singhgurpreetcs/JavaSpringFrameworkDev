package com.gurpreet.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * Create two advices
 */
@Aspect
public class LoggingAspect {

	//execution is a point cut expression
	@Before("execution(* com.gurpreet.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint)
	{
		System.out.println("Before calling the method");
	}

	@After("execution(* com.gurpreet.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint)
	{
		System.out.println("After method execution");
	}
}
