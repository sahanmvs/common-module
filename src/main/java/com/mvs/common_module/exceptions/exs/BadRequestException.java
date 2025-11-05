package com.mvs.common_module.exceptions.exs;

import com.mvs.common_module.exceptions.ExceptionType;
import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException {

    public BadRequestException(String message) { super(message); }
    public BadRequestException(ExceptionType type, String message) {
        super(type, message);
    }

    @Override
    public HttpStatus getStatus() {return HttpStatus.BAD_REQUEST;}
}
