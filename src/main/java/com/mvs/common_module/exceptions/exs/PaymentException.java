package com.mvs.common_module.exceptions.exs;

import com.mvs.common_module.exceptions.ExceptionType;

public class PaymentException extends BaseException{
    public PaymentException(String message) {
        super(message);
    }

    public PaymentException(ExceptionType type, String message) {
        super(type, message);
    }
}
