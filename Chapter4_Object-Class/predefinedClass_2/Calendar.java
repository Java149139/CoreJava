package predefinedClass_2;
/*
 *要求：显示当前月的日历，格式需与windows系统自带日历相同*/
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		// 获取当前的日期、月
		int date = today.getDayOfMonth();
		int month = today.getMonthValue();
		today = today.minusDays(date - 1);// 返回本月第一天

		System.out.println("日 	一 	二	三	四	五	六");		
		while (today.getMonthValue() == month) {//只要还在当前月便循环，免除判断本月多少天、打印多少次的麻烦
			// 获得本月第一天的星期几
			DayOfWeek dayofweek = today.getDayOfWeek();// 获得本月第一天的周对象
			int week = dayofweek.getValue(); // 由对象取值
			
			//打印第一行的缩进空格
			if (today.getDayOfMonth() == 1) {
				for (int i = 0; i < week; i++) {
					System.out.print("	");
				}
			}
			
			//迭代循环打印剩余日期，且每逢周六换行
			if (week == 6) {
				System.out.printf("%3d\n",today.getDayOfMonth());
			} else {
				System.out.printf("%3s",today.getDayOfMonth()+"	");//格式化输出字符串，解决日期为1位的与日期为2位的对齐问题
			}
			today = today.plusDays(1);//迭代
		}
		
		

	}
	
	

}
