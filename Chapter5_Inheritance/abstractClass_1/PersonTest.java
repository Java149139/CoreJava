package abstractClass_1;
/**
 * 抽象类；若抽象父类构造函数有参，子类必须显示调用父类构造方法；多态与动态绑定
* @author Wu,Jialing
* @version 9.0.1 2017年12月14日 上午11:56:52
 */
public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = new Person[2];
		
		persons[0] = new Employee("Jacke Chen", 10000.0);
		persons[1] = new Student("Wu Jialing", "IT");
		
		for (Person p : persons) {
			System.out.println(p.getDescription());
			//由于抽象类不能实例化，所以变量p永远不会引用Person对象，而是引用的Student这类具体子类对象。
			//但是，尽管变量p并没有实际调用Person类的getDescription()方法，但若想通过变量p调用该方法，仍必须在Person类中定义该方法。编译器只允许调用在类中声明的方法
		}
	}

}
