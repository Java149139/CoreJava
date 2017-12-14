package objectClass_2;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String name,double salary,int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}
	
	@Override
	public boolean equals(Object otherObject) {
		//优化：若引用同一个对象，必然相等
		if(this == otherObject) return true;
		//是否为null
		if(otherObject == null) return false;
		//是否是同一个类
		if(getClass() != otherObject.getClass()) return false;	
		
		Employee other = (Employee) otherObject;//确定otherObject属于非null的Employee类时，转化为同一个类
		//是否具有相同实例域
		return Objects.equals(name, other.name)		
				&& salary == other.salary 
				&& Objects.equals(hireDay,other.hireDay);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,salary,hireDay); //单个变量时；Objects.hashCode(name)或Double.hashCode(salary)
	}
	
	@Override
	public String toString() {
		return getClass().getName()+"[name="+name+" salary="+salary+" hireDay="+hireDay+"]";
	}
}
