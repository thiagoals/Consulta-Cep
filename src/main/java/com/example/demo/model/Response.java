package com.example.demo.model;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonAutoDetect
@Data
@AllArgsConstructor
public class Response {
	@JsonProperty
	private HttpStatus status;
	private String message;
}
