package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class ReviewEntity extends AbstractEntity{
	
	
	
	@Column(unique = true)
	private String content;
	
	@ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

	
}
