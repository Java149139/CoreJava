package abstractClass_1;

public class Student extends Person{
	private String major;
	/**
	 * 
	 * @param name 学生的姓名
	 * @param major 学生的专业
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
