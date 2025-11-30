package com.mvs.common_module.exceptions.exs;

import com.mvs.common_module.exceptions.ExceptionType;
import org.springframework.http.HttpStatus;

public class ConflictException extends BaseException {
    public ConflictException(ExceptionType type, String message) {
        super(type, message);
    }

    @Override
    public HttpStatus getStatus() {return HttpStatus.CONFLICT;}
}
