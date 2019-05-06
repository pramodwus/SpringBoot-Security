package com.sathya.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
