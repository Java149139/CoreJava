package abstractClass_1;
/**
 * �����ࣻ�������๹�캯���вΣ����������ʾ���ø��๹�췽������̬�붯̬��
* @author Wu,Jialing
* @version 9.0.1 2017��12��14�� ����11:56:52
 */
public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = new Person[2];
		
		persons[0] = new Employee("Jacke Chen", 10000.0);
		persons[1] = new Student("Wu Jialing", "IT");
		
		for (Person p : persons) {
			System.out.println(p.getDescription());
			//���ڳ����಻��ʵ���������Ա���p��Զ��������Person���󣬶������õ�Student��������������
			//���ǣ����ܱ���p��û��ʵ�ʵ���Person���getDescription()������������ͨ������p���ø÷������Ա�����Person���ж���÷�����������ֻ������������������ķ���
		}
	}

}
