package com.scalyfin.exception;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@RequiredArgsConstructor

public class ScalyfinExecption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5244085807508923081L;
	/**
	 * 
	 */
	@NotNull
	private final int errorCode;
	@NotNull
	private final String errorMsg;
	private String errorDesc;
	
}
