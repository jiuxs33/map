package com.map.tour.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/")
	public String index(Model model, HttpServletResponse response) {
		return "forward:index.html";
	}
}
