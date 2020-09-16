package com.example.WonderCV.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// GTB: - 请求数据不合法时的异常有处理吗？

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotExistException.class)
    public ResponseEntity<ErrorResult> handle(UserNotExistException ex) {
        ErrorResult errorResult = new ErrorResult(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
    }
}
