package com.scalyfin.service;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.model.dto.UnitTypeDto;

public interface UnitTypeService {

	@Transactional
	@Modifying
	Integer addNewUnitType(UnitTypeDto unitTypeDto) throws ScalyfinExecption;

	List<UnitTypeDto> getAllUnitTypes() throws ScalyfinExecption;

	UnitTypeDto getUnitTypeById(Integer id) throws ScalyfinExecption;

	void deleteUbnitType(Integer id) throws ScalyfinExecption;
	
	void softDeleteUbnitType(Integer id) throws ScalyfinExecption;

}
