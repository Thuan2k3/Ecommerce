package com.thuandev.Thuan.Ecommerce.repository;

import com.thuandev.Thuan.Ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
