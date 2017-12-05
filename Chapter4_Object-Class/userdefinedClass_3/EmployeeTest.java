package userdefinedClass_3;
//�����Զ�����Ļ���Ҫ��
import java.time.LocalDate;

public class EmployeeTest {

	public static void main(String[] args) {
		//����Ϊ�������͵�����
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Mike", 7500.0, LocalDate.of(2017, 11, 27));
		employees[1] = new Employee("Bob", 6666.0, LocalDate.of(2017, 11, 28));
		employees[2] = new Employee("Tom", 13000.0, LocalDate.of(2017, 11, 29));

		for (Employee e : employees) {
			e.setSalary();
			e.Print();
		}
		System.out.println(Employee.getAge());//��֤��Ԫ����main����

	}

}

class Employee {
	
	//���ǵ�������Employee�࣬����main������Զ����ִ�У�һ�㽫��ԭ�����ڵ�Ԫ����ĳ��ʱ
	public static void main(String[] args) {
		System.out.println("�ǹ������main��"+getAge());
	}
	
	//ʵ����(instance fields)
	private final String name; //finalʵ���򣺹�����ִ��ʱ�����ʼ�������Ҵ˺󲻿ɸ���
	private static int age=1;
	private double salary;
	private LocalDate hireday;
	
	//������(constructor)
	public Employee(String n, double s, LocalDate h) {
		this.name = n;
		this.salary = s;
		this.hireday = h;
	}
	
	//�������������޸���������get��set��
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		salary *= 3;
	}
	public LocalDate getHireday() {
		return hireday;
	}
	public static int getAge() {
		return age;
	}
	
	//��������
	public void Print() {
		System.out.println("name=" + name + " salary=" + salary + " hireday=" + hireday);
	}
}
