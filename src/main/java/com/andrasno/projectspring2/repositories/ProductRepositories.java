package com.andrasno.projectspring2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrasno.projectspring2.entities.Product;

public interface ProductRepositories extends JpaRepository<Product, Integer> {

}
