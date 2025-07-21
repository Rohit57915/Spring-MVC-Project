package org.jsp.springmvc_form_pro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class studentController {

	@GetMapping("/form")
	public String triggerForm()
	{
		return "form.jsp";
	}
	@PostMapping("/save")
	public ModelAndView saveStudent(@ModelAttribute Student student)
	{
		ModelAndView view=new ModelAndView("display.jsp");
		return view;
	}
	
}
