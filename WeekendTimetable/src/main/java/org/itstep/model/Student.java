package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name = "students")
public class Student {

	@Id
	@Column(name = "login")
	@JsonProperty
	private String login;
	
	@Column(name = "password")
	@JsonProperty
	private String password;
	
	@Column(name = "firstname")
	@JsonProperty
	private String firstName;
	
	@Column(name = "secondname")
	@JsonProperty
	private String secondName;
	
	@ManyToOne(targetEntity = Group.class)
	@JsonProperty
	private Group group;
}
