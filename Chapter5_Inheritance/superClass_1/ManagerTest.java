package superClass_1;

import java.time.LocalDate;
/**
 * ����&���ࣺ��������д��super���ø��๹��������̬���������ͼ��ݣ����������õ�ԭ��
 * @author Administrator
 */
public class ManagerTest {

	public static void main(String[] args) {
		Manager aManager = new Manager("����", 8000, LocalDate.of(2008, 8, 8));
		aManager.setBonus(5000);
		
/*		Manager[] managers = new Manager[2];
		Employee[] employees2 = managers;
		employees2[0] = new Employee("����", 1250, LocalDate.of(2008, 8, 8));
 * employees2��managers���õĶ���Manager���飬������Employee()��ֵ������employees2ʱ��
 * �ǽ�Employee��ֵ��Manager�ˣ����Իᱨ����洢�쳣
 */
		
		Employee[] employees = new Employee[3];
		employees[0] = aManager;
		employees[1] = new Manager("����", 3500, LocalDate.of(2007, 6, 30));
		employees[2] = new Manager("����", 5000, LocalDate.of(2010, 1, 30));
		
		for (Employee e : employees) {
			System.out.println(e.getName()+" "+e.getSalary()+" "+e.gethireDay());
		}
	}

}
