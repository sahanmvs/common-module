package com.mvs.common_module.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedEvent {
    private String orderId;
    private String userId;
    private List<OrderItem> orderItems;
    private BigDecimal totalAmount;
    private String status;

    @Data
    public static class OrderItem {
        private String productId;
        private int quantity;
        private long price;
    }
}
