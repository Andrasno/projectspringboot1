package com.andrasno.projectspring2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrasno.projectspring2.entities.Category;
import com.andrasno.projectspring2.repositories.CategoryRepositories;

@Service
public class CategoryService {
		
		@Autowired
		private CategoryRepositories repositories;
		
		public List<Category> findAll(){
			return repositories.findAll();
		}
		
		public Category findById(Integer id) {
			Optional<Category> obj = repositories.findById(id);
			return obj.get();
		}
}
