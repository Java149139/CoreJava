package objectConstruction_6;

import java.util.Random;
/**
 * @author Administrator
 *��ʼ����ʵ�����ʼ��������/��̬ ��ʼ���飻���������޲Ρ����ء�this������һ����������
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
	 * ��̬��ʼ���顢�����ʼ����
	 */
	static {
		nextId = new Random().nextInt(100);
	}
	
	{
		id = nextId;
	}
	
	/**
	 * 3�����ع�����
	 */
	public Employee(){
		//name��ʵ�����ʼ��
		//id����̬��ʼ���鸳ֵ
		//salaryû�г�ʼ����Ĭ��ֵΪ0.0
	}
	public Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	/**
	 * this�ؼ��ֵ�����һ��������
	 * @param salary
	 */
	public Employee(double salary) {
		this("ThisOne",salary); //�����ò����б�Ϊ(String,double)�Ĺ�����
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

