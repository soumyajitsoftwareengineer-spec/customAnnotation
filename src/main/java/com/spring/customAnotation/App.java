package com.spring.customAnotation;

import java.util.logging.Logger;

import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	Service service = context.getBean(Service.class);
    	
    	int value = service.process();
    	
    	System.out.print(value);
        
    }
    
    
}
