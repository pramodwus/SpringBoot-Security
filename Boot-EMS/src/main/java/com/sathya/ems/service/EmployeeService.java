package com.sathya.ems.service;

import java.util.List;

import com.sathya.ems.entity.Employee;

public interface EmployeeService 
{
public boolean insertEmployee(Employee e);
public List<Employee> readEmployee();
public boolean updateEmployee(Employee e);
public boolean removeEmployee(int empId);

}
