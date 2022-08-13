package com.nit;

import java.time.LocalDateTime;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01BasicDiApplication {
	
	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		System.out.println("BootProj01BasicDiApplication.createLDT()");
		return LocalDateTime.now();
	}
	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(BootProj01BasicDiApplication.class, args);
		
		WishMessageGenerator generator=context.getBean("wmg",WishMessageGenerator.class);
		
		String result=generator.showWishMessage("raja");
		System.out.println("result:::"+result);
		
		((ConfigurableApplicationContext)context).close();
		
	}

}
