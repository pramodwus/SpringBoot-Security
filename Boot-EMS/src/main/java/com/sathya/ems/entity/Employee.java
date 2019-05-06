package com.sathya.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab")
public class Employee {
@Id
@Column(name="empno")
private int empNo;

@Column(name="ename",length=10)
private String empName;

@Column(name="salary")
private int empSalary;
@Column(name="deptno")
private int deptNo;


@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + ", deptNo=" + deptNo
			+ "]";
}


public int getEmpNo() {
	return empNo;
}


public void setEmpNo(int empNo) {
	this.empNo = empNo;
}


public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public int getEmpSalary() {
	return empSalary;
}


public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}


public int getDeptNo() {
	return deptNo;
}


public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}


}

