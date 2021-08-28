/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.krasilnikov.spring.security.springsecurity.configs;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//			.antMatchers("/authenticated/**").authenticated()
////			.antMatchers("/admin/**").hasAnyRole("ADMIN", "SUPERADMIN")
////			.antMatchers("/profile/**").authenticated()
//			.and()
//			.formLogin()
//			.and()
//			.logout().logoutSuccessUrl("/");
//	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/authenticated/**").authenticated()
//			.antMatchers("/only_for_admins/**").hasRole("ADMIN")
//			.antMatchers("/read_profile/**").hasAuthority("READ_PROFILE")
			.and()
			.formLogin()
			.and()
			.logout().logoutSuccessUrl("/");
	}
}