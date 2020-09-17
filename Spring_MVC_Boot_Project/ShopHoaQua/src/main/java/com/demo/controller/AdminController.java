package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/admin"})
public class AdminController {

	@RequestMapping(value = {"/", "", "/index", "/dashboard"})
	public String dashboard() {
		return "admin-dashboard";
	}
}
