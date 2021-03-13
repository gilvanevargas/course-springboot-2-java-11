package com.katon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katon.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
