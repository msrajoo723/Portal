package com.vinnotech.employee.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vinnotech.employee.portal.model.User;
import com.vinnotech.employee.portal.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user  = userRepository.findByUsername(username);
		if(null == user) {
			throw new UsernameNotFoundException("User not Found...");
		}
		return new CustomUserDetails(user);
	}

}
