package com.thuandev.Thuan.Ecommerce.repository;

import com.thuandev.Thuan.Ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
