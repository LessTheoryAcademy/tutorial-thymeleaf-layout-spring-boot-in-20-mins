package com.lta.springthymeleaflayout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/list")
	public String list() {
		
		return "list";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		
		return "contact";
	}	
}
