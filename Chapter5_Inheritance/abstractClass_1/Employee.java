package abstractClass_1;


public class Employee extends Person{
	private double salary;
	/**
	 * @param name 雇员的姓名
	 * @param salary 雇员的薪资
	 */
	public Employee(String name,double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public String getDescription() {
		return "name="+getName()+" salary="+salary;
	}

}
