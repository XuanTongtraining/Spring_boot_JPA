package com.laptrinhjavaweb.repository.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rentarea")
public class RentAreaEntity extends BaseEntity {
	
	 @Column(name = "value")
	    private Integer value;

	 @ManyToOne()
	 @JoinColumn(name = "buildingid")
	 private BuildingEntity building;//mapper sang ben manytoOne
}
