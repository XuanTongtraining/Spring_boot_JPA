package com.laptrinhjavaweb.repository;

import java.util.List;

import com.laptrinhjavaweb.repository.Entity.BuildingEntity;

public interface iBuildingRepository {
	List<BuildingEntity> findAll();

}
