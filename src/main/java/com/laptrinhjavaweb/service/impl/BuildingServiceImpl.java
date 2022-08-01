package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.Response.BuildingSearchResponse;
import com.laptrinhjavaweb.repository.iBuildingRepository;
import com.laptrinhjavaweb.repository.Entity.BuildingEntity;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.iBuildingJdbcService;

@Service
public class BuildingServiceImpl implements iBuildingJdbcService{
	@Autowired
	private iBuildingRepository buildingDao = new BuildingRepository();
	
	@Override
	public List<BuildingSearchResponse> findAll(){
		List<BuildingSearchResponse> result = new ArrayList<>();
        List<BuildingEntity> entity = buildingDao.findAll();
        for (BuildingEntity item : entity) {
        	BuildingSearchResponse buildingSearchOutput = new BuildingSearchResponse();
        	buildingSearchOutput.setName(item.getName());
        	result.add(buildingSearchOutput);
        }
        return result;
    }

}
