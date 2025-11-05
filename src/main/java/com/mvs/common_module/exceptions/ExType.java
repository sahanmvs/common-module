package com.mvs.common_module.exceptions;

public enum ExType implements ExceptionType {
    UNAUTHORIZED, INVALID_CREDENTIALS, USER_ALREADY_EXISTS, USER_NOT_FOUND,
    PRODUCT_NOT_FOUND, INVENTORY_NOT_FOUND, INSUFFICIENT_STOCK;

    @Override
    public String getExceptionType() {
        return this.toString();
    }
}
