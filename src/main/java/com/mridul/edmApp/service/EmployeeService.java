package com.mridul.edmApp.service;

import java.util.List;

import com.mridul.edmApp.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAllEmployee();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);
}
