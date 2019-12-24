package com.andrasno.projectspring2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrasno.projectspring2.entities.OrderItem;

public interface OrderItemRepositories extends JpaRepository<OrderItem, Integer> {

}
