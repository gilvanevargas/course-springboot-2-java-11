package com.katon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katon.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
