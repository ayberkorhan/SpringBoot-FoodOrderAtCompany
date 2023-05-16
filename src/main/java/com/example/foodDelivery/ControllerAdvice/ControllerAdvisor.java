package com.example.foodDelivery.ControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.foodDelivery.Exceptions.EmpNotFoundException;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler  {
	
	
	 @ExceptionHandler(EmpNotFoundException.class)
	public ResponseEntity<Object> handleEmployeNotFound(EmpNotFoundException ex, WebRequest req){
		 
		 

		   Map<String, Object> body = new LinkedHashMap<>();
	        body.put("timestamp", LocalDateTime.now());
	        body.put("message", "employeee not found");

	        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	
	
	
	

}
