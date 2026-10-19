package com.spring.customAnotation;

import org.springframework.stereotype.Component;

@Component
public class Service {
	
	@ExecuteLog
    public int process()
    {
		int sum = 0;
    	for(int i = 1; i <= 1000000; i++)
    	{
    		sum += Math.random()*i;
    	}
    	
    	return sum;
    }
}
