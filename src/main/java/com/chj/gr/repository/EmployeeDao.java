package com.chj.gr.repository;

import java.util.List;

import com.chj.gr.model.Employee;

public interface EmployeeDao {

	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	public void deleteEmployee(Employee emp);
}
