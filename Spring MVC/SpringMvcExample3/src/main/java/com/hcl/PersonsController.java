package com.hcl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entity.Person;
@Controller
@RequestMapping("/persons")
public class PersonsController 
{
	@GetMapping("/form")
	public String showPersonsForm(Model model)
	{
		Person person=new Person();
		model.addAttribute(person);
		return "persons";
	}
	@PostMapping("/process")
	public String processForm(@ModelAttribute("person") Person person,BindingResult result) 
	{
		if(result.hasErrors())
		return "persons";
		return "confirm";
	}
}