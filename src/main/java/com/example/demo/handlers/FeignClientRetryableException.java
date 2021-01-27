package com.example.demo.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.model.Response;

import feign.RetryableException;

@ControllerAdvice
@RestController
public class FeignClientRetryableException {
	@ExceptionHandler(RetryableException.class)
	public final ResponseEntity<Object> handleFeignClientRetryableException(RetryableException ex, WebRequest request){
		return new ResponseEntity<>(new Response(HttpStatus.INTERNAL_SERVER_ERROR, "Oops! Parece que a api está fora do ar."),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
