package com.laptrinhjavaweb.repository.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "building")
public class BuildingEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "numberofbasement")
    private Integer numberOfBasement;
    
    
    @Column(name = "ward")
    private String ward;
    
    @Column(name = "street")
    private String street;
    
    @Column(name = "districtid")
    private Long districtId;
    
    @OneToMany(mappedBy = "building", fetch = FetchType.LAZY)//kết nối với đối tượng building khai báo bên RentAreaEntity
    private List<RentAreaEntity> rentAreas = new ArrayList<>();//fetch = FetchType.LAZY chỉ nằm bên one
    

    public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfBasement() {
        return numberOfBasement;
    }

    public void setNumberOfBasement(Integer numberOfBasement) {
        this.numberOfBasement = numberOfBasement;
    }
}
