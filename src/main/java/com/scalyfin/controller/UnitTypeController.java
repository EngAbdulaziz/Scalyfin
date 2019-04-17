package com.scalyfin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.facade.UnitTypeFacade;
import com.scalyfin.model.dto.UnitTypeDto;

@RestController
@RequestMapping("/scalyfin/unitType/v1")
public class UnitTypeController {

	@Autowired
	private UnitTypeFacade unitTypeFacade;

	@PostMapping(value = "/", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Integer> addNewUnitType(@RequestBody UnitTypeDto unitTypeDto) throws ScalyfinExecption {
		return new ResponseEntity<Integer>(unitTypeFacade.addNewUnitType(unitTypeDto), HttpStatus.CREATED);
	}

}
