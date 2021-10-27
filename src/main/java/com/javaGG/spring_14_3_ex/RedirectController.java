package com.javaGG.spring_14_3_ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {

	@RequestMapping("/index")
	public String goIndex() {
		
		return "index";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		
		String id = httpServletRequest.getParameter("id");
		if(id.equals("tiger" )) {
			return "redirect:studentOk";	
		}
						
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk() {
		
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg() {
		
		return "student/studentNg";
	}
	
	@RequestMapping("/studentNo")
	public String studentNo() {
		
		return "redirect:http://localhost:8181/spring_14_3_ex/studentNo1";
	}
	
	@RequestMapping("/studentNo1")
	public String studentNo1() {
		
		return "studentNo1";
	}
	
	@RequestMapping("/root")
	public String root() {
		
		return "redirect:http://localhost:8181/spring_14_3_ex/roottest.jsp";
	}
	
}