package com.scalyfin.service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.model.entity.UnitType;

public interface UnitTypeService {

	@Transactional
	@Modifying
	Integer addNewUnitType(UnitType unitType) throws ScalyfinExecption;

}
