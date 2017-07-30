package com.ankit.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.ankit.springaop.model.Circle;

@Aspect
public class LoggingAspect {

	public LoggingAspect() {
		// TODO Auto-generated constructor stub
	}

	@Before("execution(public String com.ankit.springaop.model.*.get*(..))")
	public void LoggingAdvice()
	{
		System.out.println("Advice run. Get method called");
	}

	@Before("execution(public String com.ankit.springaop.model.Circle.getName())")
	public void SecondLoggingAdvice()
	{
		System.out.println("Second Advice run. Get method called");
	}

	@Before("AllGetters()")
	public void ThirdLoggingAdvice()
	{
		System.out.println("Third Advice run. Get method called");
	}
	
	@Before("AllCircleMethods()")
	public void FourthLoggingAdvice(JoinPoint joinPoint)
	{
		System.out.println("Third Advice run. Get method called");
		
		// getTarget gives the handle of the object on which the target method was called
		Circle c = (Circle)joinPoint.getTarget();
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethods(String name, String returnString)
	{
		System.out.println("A method that calls String argument has been called. The value passed is " + name);
		System.out.println("The value supposed to be returned is " + returnString);
		returnString = returnString + " dirty";
		System.out.println("The value returned is " + returnString);
		
	}
	
	@Pointcut("execution(* get*())")
	public void AllGetters()
	{
		// This is a dummy method
	}

	@Pointcut("within(com.ankit.springaop.model.Circle)")
	public void AllCircleMethods()
	{
		// This is a dummy method
	}

}

