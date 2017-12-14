package superClass_1;

import java.time.LocalDate;

public class Manager extends Employee{
	private double bonus;
	/**
	 * @param bonus ¹ÍÔ±½±½ð
	 */
	public Manager(String name,double salary,LocalDate hireDay) {
		super(name,salary,hireDay);
		bonus = 0;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double num) {
		bonus = num;
	}
}
