package org.jsp.springmvc_proj;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/info")
	public String getInfo()
	{
	return "info.jsp";
	}

	@GetMapping("/student")
	public String getStudentInfo(Model model)
	{
		model.addAttribute("sid", "101");
		model.addAttribute("sname", "Riya");
		
		return "student.jsp";
	}

	@GetMapping("/employee")
	public String getEmployeeInfo(ModelMap map)
	{
		map.put("eid", "1");
		map.put("ename", "smith");
		map.put("esalary", "40000");
		
		return "employee.jsp";
	}

	@GetMapping("/product")
	public ModelAndView getProductInfo()
	{
		ModelAndView view=new ModelAndView("product.jsp");
		view.addObject("pid","12");
		view.addObject("pname","shoes");
		
		return view;
	}

}
