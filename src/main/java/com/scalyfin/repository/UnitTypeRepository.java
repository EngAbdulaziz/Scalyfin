package com.scalyfin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scalyfin.model.entity.UnitType;

@Repository
public interface UnitTypeRepository extends JpaRepository<UnitType, Integer> {

	public Optional<UnitType> findByUnitTypeCode(Integer code);
}
