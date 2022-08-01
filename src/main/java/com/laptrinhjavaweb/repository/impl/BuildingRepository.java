package com.laptrinhjavaweb.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.repository.iBuildingRepository;
import com.laptrinhjavaweb.repository.Entity.BuildingEntity;

@Repository
public class BuildingRepository implements iBuildingRepository{
	
	@PersistenceContext
	private EntityManager entityManager;// goij entitymanager factory ra

	@Override
	public List<BuildingEntity> findAll() {	
		//JPQL
		String sql = "FROM BuildingEntity";
		Query query = entityManager.createQuery(sql, BuildingEntity.class);//lay du lieu tu database len
		return query.getResultList();//lay ra dang list
	}

}
