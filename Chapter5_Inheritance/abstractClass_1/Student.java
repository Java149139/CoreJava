package abstractClass_1;

public class Student extends Person{
	private String major;
	/**
	 * 
	 * @param name ѧ��������
	 * @param major ѧ����רҵ
	 */
	public Student(String name,String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return "name="+getName()+" major="+major;
	}

}
