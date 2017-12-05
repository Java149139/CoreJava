package methodParam_5;
/**
 * <code>ParamTest</code>��ȷJava���������ݸ��������ǰ�ֵ���ã������õ��������в���ֵ��һ������
 * @author Administrator
 */

public class ParamTest {
	public static void main(String[] args) {
		//1,���������޸Ĵ��ݸ����Ļ����������Ͳ���
		double num = 10;
		System.out.println("����ִ��ǰ�����������Ͳ���ֵΪ��" + num);
		tripValue(num);
		System.out.println("����ִ�к�����������Ͳ���ֵΪ��" + num);

		//2,���������޸Ĵ��ݸ����Ķ��������״̬
		Employee employee = new Employee(" ", 15);
		System.out.println("����ִ��ǰ�������״̬Ϊ��" + employee.getSalary());
		tripObject(employee);
		System.out.println("����ִ�к�������״̬Ϊ��" + employee.getSalary());

		//3,����������һ��������������µĶ���
		Employee employeeA = new Employee("����", 0);
		Employee employeeB = new Employee("����", 0);
		System.out.println("����ִ��ǰ�������Aָ��" + employeeA.getName() + " Bָ��" + employeeB.getName());
		swap(employeeA, employeeB);
		System.out.println("����ִ�к�������Aָ��" + employeeA.getName() + " Bָ��" + employeeB.getName());
	}
	
	/**
	 * ����1
	 * @param n
	 */
	private static void tripValue(double n) {
		n = 3 * n;
	}
	//����2
	private static void tripObject(Employee employee) {
		employee.setSalary();
	}
	//����3
	private static void swap(Employee A, Employee B) {
		Employee tmp = A;
		A = B;
		B = tmp;
	}

}


class Employee {
	// ʵ����(instance fields)
	private final String name;
	private double salary;

	// ������(constructor)
	public Employee(String n, double s) {
		this.salary = s;
		this.name = n;
	}

	// �������������޸���������get��set��
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
