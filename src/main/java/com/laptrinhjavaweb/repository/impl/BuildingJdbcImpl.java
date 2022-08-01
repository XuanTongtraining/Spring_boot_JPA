package com.laptrinhjavaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.laptrinhjavaweb.repository.iBuildingJdbc;
import com.laptrinhjavaweb.repository.Entity.BuildingEntity;


@PropertySource("classpath:application.properties")
public class BuildingJdbcImpl implements iBuildingJdbc {
	/*private static String DB_URL = "jdbc:mysql://localhost/databaseweb";
	private static String USER = "root";
	private static String PASS = "12345678";*/
	
	@Value("$(spring.datasource.url)")
	private String URL;
	
	@Value("$(spring.datasource.username)")
	private String User;
	
	@Value("$(spring.datasource.password)")
	private String password;

	@Override
	public List<BuildingEntity> findAll() {
		List<BuildingEntity> result = new ArrayList<>();
		String query = "SELECT * FROM building";
		try (//Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Connection conn = DriverManager.getConnection(URL, User, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			while (rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("name"));
				buildingEntity.setWard(rs.getString("ward"));
				buildingEntity.setDistrictId(rs.getLong("districtid"));
				buildingEntity.setStreet(rs.getString("street"));
				result.add(buildingEntity);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
