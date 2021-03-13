package com.katon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katon.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
