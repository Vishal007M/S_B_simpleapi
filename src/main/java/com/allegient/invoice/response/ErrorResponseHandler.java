package com.allegient.invoice.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ErrorResponseHandler extends ResponseEntityExceptionHandler {

	public ResponseEntity<ErrorResponse> errorResponse(HttpStatus httpStatus, WebRequest webRequest){
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode(500);
		errorResponse.setMessage(httpStatus.toString());
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
		
	}
	
}
