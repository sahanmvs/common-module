package com.mvs.common_module.exceptions;

public enum ExType implements ExceptionType {
    UNAUTHORIZED, INVALID_CREDENTIALS, INVALID_STATUS, USER_ALREADY_EXISTS, USER_NOT_FOUND,
    PRODUCT_NOT_FOUND, INVENTORY_NOT_FOUND, INSUFFICIENT_STOCK,
    ORDER_NOT_FOUND, ORDER_ALREADY_PAID,
    CART_NOT_FOUND, EMPTY_CART, PRICE_MISMATCH,
    PAYMENT_ERROR, PAYMENT_RECORD_NOT_FOUND;
    @Override
    public String getExceptionType() {
        return this.toString();
    }
}
