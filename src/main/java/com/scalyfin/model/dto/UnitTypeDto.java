package com.scalyfin.model.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class UnitTypeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4046399175049809294L;

	private Integer unitTypeCode;
	private String unitTypeDescription;
	private Date unitTypeEndDate;
}
