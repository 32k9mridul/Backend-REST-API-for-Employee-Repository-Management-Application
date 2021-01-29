package com.mridul.edmApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mridul.edmApp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
