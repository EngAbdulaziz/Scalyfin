package com.scalyfin.facade;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.model.dto.UnitTypeDto;
import com.scalyfin.model.entity.UnitType;
import com.scalyfin.service.UnitTypeService;

@Component
public class UnitTypeFacadeImpl implements UnitTypeFacade {

	@Autowired
	private UnitTypeService unitTypeService;

	@Override
	public Integer addNewUnitType(UnitTypeDto unitTypeDto) throws ScalyfinExecption {
		UnitType unitType = new UnitType();
		BeanUtils.copyProperties(unitTypeDto, unitType);
		return unitTypeService.addNewUnitType(unitType);
	}
}
