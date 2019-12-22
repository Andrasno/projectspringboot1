package com.andrasno.projectspring2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrasno.projectspring2.entities.Product;
import com.andrasno.projectspring2.repositories.ProductRepositories;

@Service
public class ProductService {
		
		@Autowired
		private ProductRepositories repositories;
		
		public List<Product> findAll(){
			return repositories.findAll();
		}
		
		public Product findById(Integer id) {
			Optional<Product> obj = repositories.findById(id);
			return obj.get();
		}
}
