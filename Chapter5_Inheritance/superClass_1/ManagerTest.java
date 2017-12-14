package superClass_1;

import java.time.LocalDate;
/**
 * 超类&子类：方法的重写、super调用父类构造器、多态（数组类型兼容）、方法调用的原理
 * @author Administrator
 */
public class ManagerTest {

	public static void main(String[] args) {
		Manager aManager = new Manager("老王", 8000, LocalDate.of(2008, 8, 8));
		aManager.setBonus(5000);
		
/*		Manager[] managers = new Manager[2];
		Employee[] employees2 = managers;
		employees2[0] = new Employee("试验", 1250, LocalDate.of(2008, 8, 8));
 * employees2与managers引用的都是Manager数组，所以用Employee()赋值给数组employees2时，
 * 是将Employee赋值给Manager了，所以会报数组存储异常
 */
		
		Employee[] employees = new Employee[3];
		employees[0] = aManager;
		employees[1] = new Manager("张三", 3500, LocalDate.of(2007, 6, 30));
		employees[2] = new Manager("李四", 5000, LocalDate.of(2010, 1, 30));
		
		for (Employee e : employees) {
			System.out.println(e.getName()+" "+e.getSalary()+" "+e.gethireDay());
		}
	}

}
