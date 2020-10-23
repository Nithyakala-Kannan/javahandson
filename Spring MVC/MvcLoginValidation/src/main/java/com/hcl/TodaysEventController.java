package com.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodaysEventController {
	@RequestMapping("/todaysEvents")
	public String showEvent()
	{
		return "todaysEvents";
	}

}
