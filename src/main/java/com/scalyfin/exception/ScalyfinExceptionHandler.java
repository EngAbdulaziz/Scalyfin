package com.scalyfin.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ScalyfinExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseBody
	public ResponseEntity<ErrorDto> handleConstraintViolationException(ConstraintViolationException e,
			WebRequest request) {

		ErrorDto errorResponse = new ErrorDto();
		errorResponse.setErrorMsg("Entity already exist");
		errorResponse.setErrorCode(1);
		errorResponse.setErrorDesc(e.getMessage());

		return new ResponseEntity<ErrorDto>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ScalyfinExecption.class)
	@ResponseBody
	public ResponseEntity<ErrorDto> handleScalyfinExecption(ScalyfinExecption e, WebRequest request) {

		ErrorDto errorResponse = new ErrorDto();
		errorResponse.setErrorMsg(e.getErrorMsg());
		errorResponse.setErrorCode(e.getErrorCode());
		errorResponse.setErrorDesc(e.getErrorDesc()!=null ? e.getErrorDesc() : "Unknow Error");

		return new ResponseEntity<ErrorDto>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseEntity<ErrorDto> handleGenericException(Exception e, WebRequest request) {

		ErrorDto errorResponse = new ErrorDto();
		errorResponse.setErrorMsg("Generic Error");
		errorResponse.setErrorCode(-1);

		return new ResponseEntity<ErrorDto>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AuthenticationException.class)
	@ResponseBody
	public ResponseEntity<ErrorDto> procesAuthenticationException(AuthenticationException e, WebRequest request) {
		ErrorDto errorResponse = new ErrorDto();
		errorResponse.setErrorDesc(e.getMessage());
		errorResponse.setErrorMsg(HttpStatus.FORBIDDEN.name());
		errorResponse.setErrorCode(HttpStatus.FORBIDDEN.value());
		return new ResponseEntity<ErrorDto>(errorResponse, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(AccessDeniedException.class)
	@ResponseBody
	public ResponseEntity<ErrorDto> procesAccessDeniedException(AccessDeniedException e, WebRequest request) {
		ErrorDto errorResponse = new ErrorDto();
		errorResponse.setErrorDesc(e.getMessage());
		errorResponse.setErrorMsg(HttpStatus.FORBIDDEN.name());
		errorResponse.setErrorCode(HttpStatus.FORBIDDEN.value());
		return new ResponseEntity<ErrorDto>(errorResponse, HttpStatus.FORBIDDEN);
	}

}
