package objectClass_2;
/**
 * equals()、toString()、hashCode()方法的重写；子类重写父类方法
* @author Wu,Jialing
* @version 9.0.1 2017年12月14日 下午10:01:10
 */
public class EqualsTest {

	public static void main(String[] args) {
		Employee anEmployee1 = new Employee("Wang", 6000, 1996, 6, 21);
		Employee anEmployee2 = anEmployee1;
		Employee anEmployee3 = new Employee("Wang", 6000, 1996, 6, 21);
		Employee employee = new Employee("Mai", 7500, 1996, 8, 01);
		
		System.out.println("anEmployee1 == anEmployee2:"+(anEmployee1 == anEmployee2));
		System.out.println("anEmployee1 == anEmployee3:"+(anEmployee1 == anEmployee3));
		System.out.println("anEmployee1.equals(anEmployee3):"+(anEmployee1.equals(anEmployee3)));
		System.out.println("anEmployee1.equals(employee):"+(anEmployee1.equals(employee)));
		System.out.println("anEmployee1.toString(): "+anEmployee1.toString());
		System.out.println("anEmployee1.hashCode(): "+anEmployee1.hashCode());
		
		Manager aManager1 = new Manager("Lee", 4500, 1997, 12, 01, 3000);
		Manager aManager2 = new Manager("Lee", 4500, 1997, 12, 01, 3000);

		System.out.println("\n"+"aManager1.equals(aManager2):"+aManager1.equals(aManager2));
		System.out.println("aManager1.toString(): "+aManager1.toString());
		System.out.println("aManager1.hashCode(): "+aManager1.hashCode());
	}

}
