package com.mvs.common_module.exceptions.exs;

import com.mvs.common_module.exceptions.ExceptionType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BaseException extends RuntimeException{
    private String message;
    private ExceptionType type;

    public BaseException(String message) {
        super(message);
        this.message = message;
    }
    public BaseException(ExceptionType type, String message) {
        super(message);
        this.type = type;
        this.message = message;
    }

    public HttpStatus getStatus() {return HttpStatus.INTERNAL_SERVER_ERROR;}
}
