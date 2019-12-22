package com.andrasno.projectspring2.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrasno.projectspring2.entities.Order;
import com.andrasno.projectspring2.entities.User;
import com.andrasno.projectspring2.repositories.OrderRepositories;
import com.andrasno.projectspring2.repositories.UserRepositories;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{


		
	}
	
	
}
