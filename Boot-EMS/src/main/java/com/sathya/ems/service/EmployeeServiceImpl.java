package com.sathya.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.ems.entity.Employee;
import com.sathya.ems.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository er;
	
	public boolean insertEmployee(Employee e) {
		try
		{
	
			er.saveAndFlush(e);
		}
		catch(Exception ee)
		{
			return false;
		}
		return true;

		
	
	}

	public List<Employee> readEmployee() {
		
	    List list=er.findAll();
	  	return list; 
			

	
	
	}

	public boolean updateEmployee(Employee e) {
		try
		{
			er.saveAndFlush(e);
		}
		catch(Exception ee)
		{
			return false;
		}
		return true;
	
	}

	public boolean removeEmployee(int empId) {
		try
		{
			er.delete(empId);
		}
		catch(Exception ee)
		{
			return false;
		}
		return true;	
	
	
	}

}
