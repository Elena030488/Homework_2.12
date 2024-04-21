package pro.sky.Homework_2._Testing.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDivisionException extends IllegalArgumentException{
}
