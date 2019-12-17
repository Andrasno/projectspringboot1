package com.andrasno.projectspring2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrasno.projectspring2.entities.Order;
import com.andrasno.projectspring2.repositories.OrderRepositories;

@Service
public class OrderService {
		
		@Autowired
		private OrderRepositories repositories;
		
		public List<Order> findAll(){
			return repositories.findAll();
		}
		
		public Order findById(Integer id) {
			Optional<Order> obj = repositories.findById(id);
			return obj.get();
		}
}
