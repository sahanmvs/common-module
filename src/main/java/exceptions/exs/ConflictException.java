package exceptions.exs;

import org.springframework.http.HttpStatus;

public class ConflictException extends BaseException {
    public ConflictException(exceptions.ExceptionType type, String message) {
        super(type, message);
    }

    @Override
    public HttpStatus getStatus() {return HttpStatus.CONFLICT;}
}
