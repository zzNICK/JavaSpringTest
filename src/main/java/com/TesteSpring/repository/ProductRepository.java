package com.TesteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TesteSpring.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByName(String name);
}
