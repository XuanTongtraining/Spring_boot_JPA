package com.laptrinhjavaweb.Api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.customException.FieldNotFoundExcetion;
import com.laptrinhjavaweb.dto.BuildingDto;
import com.laptrinhjavaweb.dto.Request.BuildingAssignmentReqest;
import com.laptrinhjavaweb.dto.Response.BuildingSearchResponse;
import com.laptrinhjavaweb.service.iBuildingJdbcService;
import com.laptrinhjavaweb.service.impl.BuildingServiceImpl;

@RestController
@RequestMapping(value = "/Api/building")
public class BuildingApi {
	
	iBuildingJdbcService buildingService = new BuildingServiceImpl();
	@GetMapping
	public List<BuildingSearchResponse> findAll() {
		// required = false thif trong url có thể gưi hoặc không gửi tham số này đều
		// chạy ko lỗi
		// @ResponseBody chuc nang chuyen doi sang Ison
		//BuildingSearchResponse results = new BuildingSearchResponse();
		List<BuildingSearchResponse> results = buildingService.findAll();
		/*
		 * try {
		 * 
		 * }catch(Exception e) { }
		 */
		return results;
	}

	@PostMapping
	public BuildingDto insertBuilding(@RequestBody BuildingDto building) { // @ResponseBody chuc nang chuyen doi sang
																			// Ison
		try {
			validation(building);
			return building;
		} catch (FieldNotFoundExcetion ex) {
			return null;

		}
	}

	@PutMapping
	public BuildingDto updateBuildung() {
		// @ResponseBody chuc nang chuyen doi sang Ison
		BuildingDto results = new BuildingDto();
		return results;
	}

	private void validation(BuildingDto building) {
		if (building.getName() == null) {
			throw new FieldNotFoundExcetion("name not null");
		}
	}

	@PostMapping("/assignment")
	public void assignBuilding(@RequestBody BuildingAssignmentReqest buildingAssignmentReqest) {

		System.out.println(buildingAssignmentReqest.getId());

	}
}
