package com.empmgm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	 private int empId;
	private String empName;
	private String empProject;
	private String empLocation;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpProject() {
		return empProject;
	}
	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empProject=" + empProject + ", empLocation="
				+ empLocation + "]";
	}
	
	
	
}

