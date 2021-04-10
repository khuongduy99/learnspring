package com.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends AbstractEntity{
	
	
	
	@Column(unique = true)
	private String name;
	

	@ManyToMany(mappedBy = "listRole")
    private List<UserEntity> listUser = new ArrayList<UserEntity>();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
