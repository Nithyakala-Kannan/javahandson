package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class AnnotationConfigure {
		
	@Bean(name="owner")
	public Owner setDetails()
	{
		Owner owner=new Owner();
		owner.setName("Adhithya ");
		owner.setPassword("adhikg1234 ");
		owner.setMobileNumber("9789097806");
		return owner;
	}
	}

