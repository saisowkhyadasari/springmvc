package beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empcode;
	private String empname;
	private Double salary;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(int empcode, String empname, Double salary) {
		
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
	}
	public Employee() {
		
	}
	

}
