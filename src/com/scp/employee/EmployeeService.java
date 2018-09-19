package com.scp.employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {

	public boolean addEmployee(Employee  emp);
	public Employee getEmployee(int empId);
	public boolean deleteEmployee(int empId);
	public Employee updateEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	
}


class EmployeeServiceImpl implements EmployeeService{

	public static List<Employee> listOfEmps = new ArrayList(); //
	
	
	@Override
	public boolean addEmployee(Employee emp) {
		listOfEmps.add(emp);
		return true;
	}

	@Override
	public Employee getEmployee(int empId) {
		for(int i=0;i<listOfEmps.size();i++){
				Employee item = listOfEmps.get(i);
				if(item.getEmpId() == empId)
					return item;
		}
		
		return null;
	}

	@Override
	public boolean deleteEmployee(int empId) {
	
		for(int i=0;i<listOfEmps.size();i++){
			Employee item = listOfEmps.get(i);
			if(item.getEmpId() == empId)
				return listOfEmps.remove(item);
	}
		
		return false;
	}

	@Override
	public Employee updateEmployee(Employee userEmp) {
		
		
		for(int i=0;i<listOfEmps.size();i++){
			Employee item = listOfEmps.get(i);
			if(item.getEmpId() == userEmp.getEmpId()){
				item.setEmpName(userEmp.getEmpName());
				item.setEmpSalary(userEmp.getEmpSalary());
				item.setEmpAddress(userEmp.getEmpAddress());
				
			}
	
		
		}

		
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}
	
}



/**
 * 
 * @author Yogesh
 *
 */
class Employee{
		private int empId;
		private String empName;
		private String empAddress;
		private double empSalary;
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
		public String getEmpAddress() {
			return empAddress;
		}
		public void setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
		}
		public double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		@Override
		public String toString() {
			return "\n Employee [empId=" + empId + ", empName=" + empName
					+ ", empAddress=" + empAddress + ", empSalary=" + empSalary
					+ "]";
		}
		public Employee(int empId, String empName, String empAddress,
				double empSalary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empAddress = empAddress;
			this.empSalary = empSalary;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//tostring getters-setters no-arg constructor -- param constructor
		
		
		
		
	
}
