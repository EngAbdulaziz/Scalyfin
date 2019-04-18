package com.scalyfin.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitTypeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4046399175049809294L;

	private Integer unitTypeCode;
	private String unitTypeDescription;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date unitTypeEndDate;
}
