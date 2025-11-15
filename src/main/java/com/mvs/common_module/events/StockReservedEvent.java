package com.mvs.common_module.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StockReservedEvent {
    private String orderId;
    @Builder.Default
    private List<OrderCreatedEvent.OrderItem> items = new ArrayList<>();
}
