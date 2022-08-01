/*package com.laptrinhjavaweb.repository.Entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userrole")
public class UserRoleEntity  extends BaseEntity{
	
	 @ManyToOne()
	 @JoinColumn(name = "userid")
	 private UserEntity userEntity;//mapper sang ben manytoOne
	 

	 @ManyToOne()
	 @JoinColumn(name = "roleid")
	 private RoleEntity roleEntity;


	public UserEntity getUserEntity() {
		return userEntity;
	}


	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}


	public RoleEntity getRoleEntity() {
		return roleEntity;
	}


	public void setRoleEntity(RoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}

}
*/