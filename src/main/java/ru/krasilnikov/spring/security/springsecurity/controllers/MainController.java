/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.krasilnikov.spring.security.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Класс MainController
 */
public class MainController {

	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	@GetMapping("/authenticated")
	public String pageForAuthenticatedUser() {
		return "secured part of web service";
	}
}