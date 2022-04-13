package com.authentication.jwt.config;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(username.equals("Rishi")) {
			return new User("Rishi", "{noop}Rishi123", new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("User not found !!!");
		}
	}

}
