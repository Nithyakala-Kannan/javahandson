package com.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ContactUsController {
	@RequestMapping("/contactus")
	public String showContact()
	{
		return "contactus";
	}

}
