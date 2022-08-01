package com.laptrinhjavaweb.dto.Request;

import java.util.ArrayList;
import java.util.List;

public class BuildingAssignmentReqest {
	private Long id;
	private List<Long> staffIds = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Long> getStaffIds() {
		return staffIds;
	}

	public void setStaffIds(List<Long> staffIds) {
		this.staffIds = staffIds;
	}

}
