package abstractClass_1;


public class Employee extends Person{
	private double salary;
	/**
	 * @param name ��Ա������
	 * @param salary ��Ա��н��
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
