package com.laptrinhjavaweb.ControllerAdvice;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.laptrinhjavaweb.dto.ResponseBuilding;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	@ExceptionHandler(FileNotFoundException.class)
	public ResponseEntity<ResponseBuilding> handleFileNotFoundException(FileNotFoundException e, WebRequest request ) {
		ResponseBuilding responseBuilding = new ResponseBuilding();
		responseBuilding.setData(null);
		responseBuilding.setError(e.getMessage());
		return new ResponseEntity<>(responseBuilding, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}