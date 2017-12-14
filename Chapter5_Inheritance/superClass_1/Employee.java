package superClass_1;

import java.time.LocalDate;

public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDay;
	/**
	  @param name 雇员姓名
	  @param salary 雇员薪水
	  @param hireDay 雇员受雇日期
	 */
	
	public Employee(String name,double salary,LocalDate hireDay) {
		this.name = name;
		this.salary = salary;
		this.hireDay = hireDay;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate gethireDay() {
		return hireDay;
	}
	
	public void setSalary(double aRaise) {
		salary += aRaise;
	}
}
