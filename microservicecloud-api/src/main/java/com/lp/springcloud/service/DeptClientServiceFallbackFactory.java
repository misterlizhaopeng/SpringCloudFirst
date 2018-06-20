package com.lp.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lp.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {

			@Override
			public List<Dept> list() {
				List<Dept> depts =new ArrayList<>();
				depts.add(new Dept(100l, "dname2", "db2"));
				depts.add(new Dept(100l, "dname", "db"));
				return depts ;
			}

			@Override
			public Dept get(long id) {
				return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDbsource("no this database in MySQL");
			}

			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
