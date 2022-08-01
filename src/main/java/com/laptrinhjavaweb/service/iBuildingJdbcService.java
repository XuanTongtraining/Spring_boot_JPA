package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.Response.BuildingSearchResponse;

public interface iBuildingJdbcService {
	List<BuildingSearchResponse> findAll();
}
