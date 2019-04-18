package com.scalyfin.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.model.dto.UnitTypeDto;
import com.scalyfin.model.entity.UnitType;
import com.scalyfin.repository.UnitTypeRepository;

@Service
public class UnitTypeServiceImpl implements UnitTypeService {

	private static final Integer DELETED = 1;

	@Autowired
	private UnitTypeRepository unitTypeRepository;

	@Override
	public Integer addNewUnitType(UnitTypeDto unitTypeDto) throws ScalyfinExecption {
		UnitType unitType = new UnitType();
		BeanUtils.copyProperties(unitTypeDto, unitType);
		return unitTypeRepository.save(unitType).getUnitTypeCode();
	}

	@Override
	public List<UnitTypeDto> getAllUnitTypes() throws ScalyfinExecption {
		List<UnitType> allTypes = unitTypeRepository.findAll();
		List<UnitTypeDto> unitTypes = allTypes.stream().map(type -> new UnitTypeDto(type.getUnitTypeCode(),
				type.getUnitTypeDescription(), type.getUnitTypeEndDate())).collect(Collectors.toList());
		return unitTypes;
	}

	@Override
	public UnitTypeDto getUnitTypeById(Integer id) throws ScalyfinExecption {
		Optional<UnitType> typeOptional = unitTypeRepository.findById(id);
		typeOptional.orElseThrow(
				() -> new ScalyfinExecption(404, "Unit Type with Id: " + id + " not found", "Entity Not Found"));
		return getUnitTypeDtoFronunitTypeEntity(typeOptional.get());
	}

	private UnitTypeDto getUnitTypeDtoFronunitTypeEntity(UnitType type) {
		UnitTypeDto dto = new UnitTypeDto();
		BeanUtils.copyProperties(type, dto);
		return dto;
	}

	@Override
	public void deleteUbnitType(Integer id) throws ScalyfinExecption {
		unitTypeRepository.deleteById(id);
	}

	@Override
	public void softDeleteUbnitType(Integer id) throws ScalyfinExecption {
		Optional<UnitType> typeOptional = unitTypeRepository.findById(id);
		typeOptional.orElseThrow(
				() -> new ScalyfinExecption(404, "Unit Type with Id: " + id + " not found", "Entity Not Found"));
		UnitType type = typeOptional.get();
		type.setIsDeleted(DELETED);
		unitTypeRepository.save(type);

	}

}
