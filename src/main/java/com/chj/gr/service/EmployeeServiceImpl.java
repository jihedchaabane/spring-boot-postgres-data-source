package com.chj.gr.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chj.gr.model.Employee;
import com.chj.gr.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Resource
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public void insertEmployee(Employee emp) {
		employeeDao.insertEmployee(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
	}

	@Override
	public void executeUpdateEmployee(Employee emp) {
		employeeDao.executeUpdateEmployee(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);
	}
}
