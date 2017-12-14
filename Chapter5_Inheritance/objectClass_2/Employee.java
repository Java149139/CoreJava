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
		//�Ż���������ͬһ�����󣬱�Ȼ���
		if(this == otherObject) return true;
		//�Ƿ�Ϊnull
		if(otherObject == null) return false;
		//�Ƿ���ͬһ����
		if(getClass() != otherObject.getClass()) return false;	
		
		Employee other = (Employee) otherObject;//ȷ��otherObject���ڷ�null��Employee��ʱ��ת��Ϊͬһ����
		//�Ƿ������ͬʵ����
		return Objects.equals(name, other.name)		
				&& salary == other.salary 
				&& Objects.equals(hireDay,other.hireDay);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,salary,hireDay); //��������ʱ��Objects.hashCode(name)��Double.hashCode(salary)
	}
	
	@Override
	public String toString() {
		return getClass().getName()+"[name="+name+" salary="+salary+" hireDay="+hireDay+"]";
	}
}
