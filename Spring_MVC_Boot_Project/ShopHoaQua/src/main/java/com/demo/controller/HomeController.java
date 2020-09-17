package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "", "index" })
	public String home() {
		return "home";
	}

	@RequestMapping(value = {"/dashboard"})
	public String dashboard() {
		return "admin-dashboard";
	}

	@RequestMapping(value ="/wishlist")
	public String wishlist() {
		return "home-wishlist";
	}

	@RequestMapping(value ="/shop")
	public String shop() {
		return "home-shop";
	}

	@RequestMapping(value ="/product-single")
	public String productSingle() {
		return "home-product-single";
	}

	@RequestMapping(value ="/contact")
	public String contact() {
		return "home-contact";
	}

	@RequestMapping(value ="/checkout")
	public String checkout() {
		return "home-checkout";
	}

	@RequestMapping(value ="/cart")
	public String cart() {
		return "home-cart";
	}

	@RequestMapping(value ="/blog")
	public String blog() {
		return "home-blog";
	}

	@RequestMapping(value ="/blog-single")
	public String blogSingle() {
		return "home-blog-single";
	}

	@RequestMapping(value ="/about")
	public String about() {
		return "home-about";
	}

	@RequestMapping(value ="/404")
	public String page404() {
		return "error-404";
	}
}
