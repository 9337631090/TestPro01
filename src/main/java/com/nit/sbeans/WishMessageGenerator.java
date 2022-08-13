package com.nit.sbeans;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;
	
	public WishMessageGenerator() {
	System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	public String showWishMessage(String user) {	
		System.out.println("WishMessageGenerator.showWishMessage()");
		
		int hour=ldt.getHour();
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good Evening";
		else 
			return "Good Night";
		
		
	}

}
