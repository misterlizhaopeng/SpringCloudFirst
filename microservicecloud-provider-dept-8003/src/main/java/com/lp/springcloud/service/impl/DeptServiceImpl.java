package com.lp.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.springcloud.dao.DeptDao;
import com.lp.springcloud.entities.Dept;
import com.lp.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long deptno) {
		return deptDao.findById(deptno);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}
}
