package org.jsp.springmvc_empleave_proj;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    // Serve login form
    @GetMapping("/empLogin")
    public String showLoginForm() {
        return "empLogin.jsp";
    }

    // Handle login form submission
    @PostMapping("/empLogin")
    public String validateLogin(HttpServletRequest request) {
        String id = request.getParameter("empId");
        String pwd = request.getParameter("emppassword");

        if ("12".equals(id) && "abc@123".equals(pwd)) {
            return "empLeave.jsp";  // success page
        } else {
            return "empLogin.jsp";  // login again
        }
    }

    // Serve leave application form (optional if you directly go from login)
    @GetMapping("/empLeave")
    public String showLeaveForm() {
        return "empLeave.jsp";
    }

    // Handle leave form submission and display data
    @PostMapping("/saveLeave")
    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
        ModelAndView view = new ModelAndView("empdisplay.jsp");
        view.addObject("Employee", employee);
        return view;
    }
}
