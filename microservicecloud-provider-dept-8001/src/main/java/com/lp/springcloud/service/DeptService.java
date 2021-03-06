package com.lp.springcloud.service;

import java.util.List;

import com.lp.springcloud.entities.Dept;

public interface DeptService {
	public boolean add(Dept dept);
	public Dept get(Long deptno);
	public List<Dept> list();
}
