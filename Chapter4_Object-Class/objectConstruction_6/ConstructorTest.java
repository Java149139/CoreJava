package objectConstruction_6;

import java.util.Random;
/**
 * @author Administrator
 *初始化：实例域初始化；对象/静态 初始化块；构造器（无参、重载、this调用另一个构造器）
 */

public class ConstructorTest {
	public static void main(String[] args) {
		Employee[] employee = new Employee[3];		
		employee[0] = new Employee();	
		employee[1] = new Employee(6000.0);
		employee[2] = new Employee("anEmployee", 8000.0);
		
		for (Employee e : employee) {
			System.out.println(e.getName()+" "+e.getId()+" "+e.getSalary());
		}
	}
}

class Employee{
	private static int nextId;
	
	private String name="NoOne"; 
	private int id;
	private double salary;
	/**
	 * 静态初始化块、对象初始化块
	 */
	static {
		nextId = new Random().nextInt(100);
	}
	
	{
		id = nextId;
	}
	
	/**
	 * 3个重载构造器
	 */
	public Employee(){
		//name被实例域初始化
		//id被静态初始化块赋值
		//salary没有初始化，默认值为0.0
	}
	public Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	/**
	 * this关键字调用另一个构造器
	 * @param salary
	 */
	public Employee(double salary) {
		this("ThisOne",salary); //将调用参数列表为(String,double)的构造器
	}
	
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

