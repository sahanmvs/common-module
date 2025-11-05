package com.mvs.common_module.events;

import lombok.Data;

import java.time.Instant;

@Data
public class InventoryUpdatedEvent {
    private String productId;
    private int quantity;
    private Instant timestamp;

    public InventoryUpdatedEvent() {}

    public InventoryUpdatedEvent(int quantity, String productId, Instant timestamp) {
        this.quantity = quantity;
        this.productId = productId;
        this.timestamp = timestamp;
    }
}
