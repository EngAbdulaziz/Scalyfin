package com.scalyfin.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDto {
	private int errorCode;
	private String errorMsg;
	private String errorDesc;
}
