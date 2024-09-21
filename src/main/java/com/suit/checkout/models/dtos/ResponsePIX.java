package com.suit.checkout.models.dtos;

public record ResponsePIX(
        String id,
        String paymentCodeBase64,
        String paymentCode,
        String description
) {
}
