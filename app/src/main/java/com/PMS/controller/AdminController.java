package com.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PMS.mapper.AdminMapper;
import com.PMS.pojo.Admin;

@RestController
public class AdminController {
	@Autowired
	private AdminMapper adminMapper;
	@RequestMapping("/admin")
	public List<Admin> login() {
		List<Admin> selectList = adminMapper.selectList(null);
		System.out.println(selectList.get(0).getName());
		return selectList;
		
	}
}
