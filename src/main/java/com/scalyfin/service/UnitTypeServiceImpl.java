package com.scalyfin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.model.entity.UnitType;
import com.scalyfin.repository.UnitTypeRepository;

@Service
public class UnitTypeServiceImpl implements UnitTypeService {

	private static final Integer DELETED = 1;

	@Autowired
	private UnitTypeRepository unitTypeRepository;

	@Override
	public Integer addNewUnitType(UnitType unitType) throws ScalyfinExecption {
		return unitTypeRepository.save(unitType).getUnitTypeCode();
	}

}
