package com.mvs.common_module.events;

import lombok.Data;

import java.time.Instant;

@Data
public class ProductCreatedEvent {
    private String productId;
    private Instant timestamp;

    public ProductCreatedEvent(Instant timestamp, String productId) {
        this.timestamp = timestamp;
        this.productId = productId;
    }
}
