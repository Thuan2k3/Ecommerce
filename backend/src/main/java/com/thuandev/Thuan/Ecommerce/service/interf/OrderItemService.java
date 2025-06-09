package com.thuandev.Thuan.Ecommerce.service.interf;

import com.thuandev.Thuan.Ecommerce.dto.OrderRequest;
import com.thuandev.Thuan.Ecommerce.dto.Response;
import com.thuandev.Thuan.Ecommerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}