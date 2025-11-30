package com.mvs.common_module.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentFailedEvent {
    private String orderId;
    private String paymentStatus;
}
