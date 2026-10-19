package com.spring.customAnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecuteLogAspect {

	@Around("@annotation(com.spring.customAnotation.ExecuteLog)")
	public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable
	{
		String methodName = joinPoint.getSignature().getName();
		
		long startTime = System.currentTimeMillis();
		
		System.out.println(methodName);
		
		try {
			Object obj = joinPoint.proceed();
			
			return obj;
		} 
		finally {
			long endTime = System.currentTimeMillis();
			
			System.out.println("Total time taken to execute " +(endTime - startTime) + " ms");
			
		}
	}
}
