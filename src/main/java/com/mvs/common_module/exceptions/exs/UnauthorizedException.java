package com.mvs.common_module.exceptions.exs;

import com.mvs.common_module.exceptions.ExceptionType;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends BaseException {
    public UnauthorizedException(ExceptionType type, String message) {
        super(type, message);
    }

    @Override
    public HttpStatus getStatus() {return HttpStatus.UNAUTHORIZED;}
}
