package com.authentication.jwt.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.authentication.jwt.repository.UserRepo;
import com.jwt.authentication.model.User;

@Component
public class CustomUserDetailService implements UserDetailsService {
	
	Logger logger = LoggerFactory.getLogger(CustomUserDetailService.class);
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User findByUsername = userRepo.findByUsername(username);
		logger.info("findByUsername :{}", findByUsername);
		if(ObjectUtils.isEmpty(findByUsername)) {
			throw new UsernameNotFoundException("User not found !!!");
		}else {
			
			return new org.springframework.security.core.userdetails.User(findByUsername.getUsername(), "{noop}"+findByUsername.getPassword(), new ArrayList<>());
		}
		
//		if(username.equals("Rishi")) {
//			return new User("Rishi", "{noop}Rishi123", new ArrayList<>());
//		}else {
//			throw new UsernameNotFoundException("User not found !!!");
//		}
	}


}
