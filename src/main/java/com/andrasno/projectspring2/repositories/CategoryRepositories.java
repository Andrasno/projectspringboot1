package com.andrasno.projectspring2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrasno.projectspring2.entities.Category;

public interface CategoryRepositories extends JpaRepository<Category, Integer> {

}
