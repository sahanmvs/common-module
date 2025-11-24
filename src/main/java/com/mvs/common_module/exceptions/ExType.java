package com.mvs.common_module.exceptions;

public enum ExType implements ExceptionType {
    UNAUTHORIZED, INVALID_CREDENTIALS, INVALID_STATUS, USER_ALREADY_EXISTS, USER_NOT_FOUND,
    PRODUCT_NOT_FOUND, INVENTORY_NOT_FOUND, INSUFFICIENT_STOCK,
    ORDER_NOT_FOUND,
    CART_NOT_FOUND, EMPTY_CART, PRICE_MISMATCH;
    @Override
    public String getExceptionType() {
        return this.toString();
    }
}
