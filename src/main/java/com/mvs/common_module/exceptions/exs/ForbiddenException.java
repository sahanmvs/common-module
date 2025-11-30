package com.mvs.common_module.exceptions.exs;

import com.mvs.common_module.exceptions.ExceptionType;
import org.springframework.http.HttpStatus;

public class ForbiddenException extends BaseException{
    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(ExceptionType type, String message) {
        super(type, message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.FORBIDDEN;
    }
}
