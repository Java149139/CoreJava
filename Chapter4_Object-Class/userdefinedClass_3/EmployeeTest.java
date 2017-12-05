package userdefinedClass_3;
//掌握自定义类的基本要素
import java.time.LocalDate;

public class EmployeeTest {

	public static void main(String[] args) {
		//以类为数据类型的数组
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Mike", 7500.0, LocalDate.of(2017, 11, 27));
		employees[1] = new Employee("Bob", 6666.0, LocalDate.of(2017, 11, 28));
		employees[2] = new Employee("Tom", 13000.0, LocalDate.of(2017, 11, 29));

		for (Employee e : employees) {
			e.setSalary();
			e.Print();
		}
		System.out.println(Employee.getAge());//验证单元测试main方法

	}

}

class Employee {
	
	//除非单独运行Employee类，否则本main方法永远不会执行；一般将本原理用于单元测试某类时
	public static void main(String[] args) {
		System.out.println("非公有类的main："+getAge());
	}
	
	//实例域(instance fields)
	private final String name; //final实例域：构造器执行时必须初始化该域，且此后不可更改
	private static int age=1;
	private double salary;
	private LocalDate hireday;
	
	//构造器(constructor)
	public Employee(String n, double s, LocalDate h) {
		this.name = n;
		this.salary = s;
		this.hireday = h;
	}
	
	//访问器方法与修改器方法（get、set）
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
	
	//其他方法
	public void Print() {
		System.out.println("name=" + name + " salary=" + salary + " hireday=" + hireday);
	}
}
