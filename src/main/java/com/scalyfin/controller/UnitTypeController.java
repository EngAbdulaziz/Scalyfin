package com.scalyfin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalyfin.exception.ScalyfinExecption;
import com.scalyfin.model.dto.UnitTypeDto;
import com.scalyfin.service.UnitTypeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/scalyfin/unitType/v1")
public class UnitTypeController {

	@Autowired
	private UnitTypeService unitTypeService;

	@PostMapping(value = "/", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Integer> addNewUnitType(@RequestBody UnitTypeDto unitTypeDto) throws ScalyfinExecption {
		return new ResponseEntity<Integer>(unitTypeService.addNewUnitType(unitTypeDto), HttpStatus.CREATED);
	}

	@GetMapping(value = "/", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<List<UnitTypeDto>> getAllUnitType() throws ScalyfinExecption {
		return new ResponseEntity<List<UnitTypeDto>>(unitTypeService.getAllUnitTypes(), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<UnitTypeDto> getUnitTypeById(@PathVariable Integer id) throws ScalyfinExecption {
		return new ResponseEntity<UnitTypeDto>(unitTypeService.getUnitTypeById(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteUnitType(@PathVariable Integer id) throws ScalyfinExecption {
		unitTypeService.deleteUbnitType(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping(value = "softDelete/{id}")
	public ResponseEntity<?> softDeleteUnitType(@PathVariable Integer id) throws ScalyfinExecption {
		unitTypeService.softDeleteUbnitType(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
