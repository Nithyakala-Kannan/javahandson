package com.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
	@RequestMapping("/contactUs")
	public String showContact()
	{
		return "contactUs";
	}

}
