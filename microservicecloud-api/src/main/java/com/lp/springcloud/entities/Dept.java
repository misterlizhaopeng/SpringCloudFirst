package com.lp.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable {//必须序列化
	private Long deptno;// main key
	private String dname;// 部门名称
	private String dbsource;// 每个服务对应的db
	
//	public static void main(String[] args) {
//		Dept dept =new Dept();
//		dept.setDeptno(1L).setDname("开发部").setDbsource("test");
//	}
}
