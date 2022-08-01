package com.laptrinhjavaweb.Api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.UserDto;

@RestController
public class UserApi {
	@GetMapping("/(id)")
	public List<UserDto> getStaff(@RequestParam(value = "buildingid", required = false) Long buildingId){
		List<UserDto>  result = new ArrayList<>();
		return result;
	}

}
