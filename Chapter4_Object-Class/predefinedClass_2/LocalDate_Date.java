package predefinedClass_2;
//�������ʹ��Ԥ������
//Date�ࣺ��ʾʱ��㣻LocalDate�ࣺ��ʾ������ʾ������ʱ���������ֿ�
import java.time.LocalDate;
import java.util.Date;

public class LocalDate_Date{

	public static void main(String[] args) {
		System.out.println(LocalDate.now());	//��̬����������������ù�����
		System.out.println(new Date());			//����������Date����
		
		//�����ض����ڵĶ���
		LocalDate localdate = LocalDate.of(1996,06,21);
		LocalDate afterDate = localdate.plusDays(10000);//�൱ǰ��������1000���Ժ�
		//LocalDate beforeDate = localdate.minusDays(10000);//�൱ǰ��������1000����ǰ
		
		int year = afterDate.getYear();
		int Month = afterDate.getMonthValue();
		int Day = afterDate.getDayOfMonth();
		
		System.out.println(year+" "+Month+" "+Day);
	}
	
	

}
