package com.example.demo.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.model.Response;

import feign.FeignException.FeignClientException;

@RestController
@ControllerAdvice
public class FeignClientExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(FeignClientException.class)
	public final ResponseEntity<Object> handleFeignClientException(FeignClientException ex, WebRequest request) throws Exception{
		return new ResponseEntity<>(new Response(HttpStatus.INTERNAL_SERVER_ERROR, "Oops! Aconteceu algum problema ao consumir a API."),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
