package methodParam_5;
/**
 * <code>ParamTest</code>明确Java将参数传递给方法总是按值调用，方法得到的是所有参数值的一个拷贝
 * @author Administrator
 */

public class ParamTest {
	public static void main(String[] args) {
		//1,方法不能修改传递给它的基本数据类型参数
		double num = 10;
		System.out.println("方法执行前基本数据类型参数值为：" + num);
		tripValue(num);
		System.out.println("方法执行后基本数据类型参数值为：" + num);

		//2,方法可以修改传递给它的对象参数的状态
		Employee employee = new Employee(" ", 15);
		System.out.println("方法执行前对象参数状态为：" + employee.getSalary());
		tripObject(employee);
		System.out.println("方法执行后对象参数状态为：" + employee.getSalary());

		//3,方法不能让一个对象参数引用新的对象
		Employee employeeA = new Employee("张三", 0);
		Employee employeeB = new Employee("李四", 0);
		System.out.println("方法执行前对象参数A指向：" + employeeA.getName() + " B指向：" + employeeB.getName());
		swap(employeeA, employeeB);
		System.out.println("方法执行后对象参数A指向：" + employeeA.getName() + " B指向：" + employeeB.getName());
	}
	
	/**
	 * 方法1
	 * @param n
	 */
	private static void tripValue(double n) {
		n = 3 * n;
	}
	//方法2
	private static void tripObject(Employee employee) {
		employee.setSalary();
	}
	//方法3
	private static void swap(Employee A, Employee B) {
		Employee tmp = A;
		A = B;
		B = tmp;
	}

}


class Employee {
	// 实例域(instance fields)
	private final String name;
	private double salary;

	// 构造器(constructor)
	public Employee(String n, double s) {
		this.salary = s;
		this.name = n;
	}

	// 访问器方法与修改器方法（get、set）
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		salary *= 3;
	}
	public String getName() {
		return name;
	}
}
