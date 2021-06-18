package com.ernest.dailycodebuffer.vo;

import com.ernest.dailycodebuffer.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTempalteVO {
	
	private User user;
	private Department department;

}
