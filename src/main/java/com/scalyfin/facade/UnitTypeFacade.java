package com.scalyfin.facade;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.model.dto.UnitTypeDto;

public interface UnitTypeFacade {

	Integer addNewUnitType(UnitTypeDto unitTypeDto) throws ScalyfinExecption;
}
