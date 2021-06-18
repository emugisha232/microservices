package com.ernest.dailycodebuffer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

}
