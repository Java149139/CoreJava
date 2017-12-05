package predefinedClass_2;
//掌握如何使用预定义类
//Date类：表示时间点；LocalDate类：表示日历表示法。将时间与日历分开
import java.time.LocalDate;
import java.util.Date;

public class LocalDate_Date{

	public static void main(String[] args) {
		System.out.println(LocalDate.now());	//静态工厂方法代表你调用构造器
		System.out.println(new Date());			//构造器构造Date对象
		
		//构造特定日期的对象
		LocalDate localdate = LocalDate.of(1996,06,21);
		LocalDate afterDate = localdate.plusDays(10000);//距当前对象日期1000天以后
		//LocalDate beforeDate = localdate.minusDays(10000);//距当前对象日期1000天以前
		
		int year = afterDate.getYear();
		int Month = afterDate.getMonthValue();
		int Day = afterDate.getDayOfMonth();
		
		System.out.println(year+" "+Month+" "+Day);
	}
	
	

}
