package com.ernest.dailycodebuffer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernest.dailycodebuffer.entity.Department;
import com.ernest.dailycodebuffer.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	
	public Department saveDepartment(Department department) {
		log.info("inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("inside findDepartmentById method of DepartmentService");

		return departmentRepository.findByDepartmentId(departmentId);
	}

}
