package com.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TodaysEventsController {
	@RequestMapping("/todaysevents")
	public String showEvent()
	{
		return "todaysevents";
	}

}
