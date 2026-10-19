package com.spring.customAnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.spring.customAnotation")
@EnableAspectJAutoProxy
public class JavaConfig {

}
