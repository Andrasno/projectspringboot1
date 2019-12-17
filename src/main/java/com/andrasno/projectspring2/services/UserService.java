package com.andrasno.projectspring2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrasno.projectspring2.entities.User;
import com.andrasno.projectspring2.repositories.UserRepositories;

@Service
public class UserService {
		
		@Autowired
		private UserRepositories repositories;
		
		public List<User> findAll(){
			return repositories.findAll();
		}
		
		public User findById(Integer id) {
			Optional<User> obj = repositories.findById(id);
			return obj.get();
		}
}
