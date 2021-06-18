package com.ernest.dailycodebuffer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ernest.dailycodebuffer.entity.User;
import com.ernest.dailycodebuffer.repository.UserRepository;
import com.ernest.dailycodebuffer.vo.Department;
import com.ernest.dailycodebuffer.vo.ResponseTempalteVO;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTempalteVO getUserWithDepartment(Long userId) {
		ResponseTempalteVO vo = new ResponseTempalteVO();
		User user = userRepository.findById(userId).get();

		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" +user.getDepartmentId(),
				Department.class);
		vo.setUser(user);
		vo.setDepartment(department);

		return vo;
	}

}
