package predefinedClass_2;
/*
 *Ҫ����ʾ��ǰ�µ���������ʽ����windowsϵͳ�Դ�������ͬ*/
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		// ��ȡ��ǰ�����ڡ���
		int date = today.getDayOfMonth();
		int month = today.getMonthValue();
		today = today.minusDays(date - 1);// ���ر��µ�һ��

		System.out.println("�� 	һ 	��	��	��	��	��");		
		while (today.getMonthValue() == month) {//ֻҪ���ڵ�ǰ�±�ѭ��������жϱ��¶����졢��ӡ���ٴε��鷳
			// ��ñ��µ�һ������ڼ�
			DayOfWeek dayofweek = today.getDayOfWeek();// ��ñ��µ�һ����ܶ���
			int week = dayofweek.getValue(); // �ɶ���ȡֵ
			
			//��ӡ��һ�е������ո�
			if (today.getDayOfMonth() == 1) {
				for (int i = 0; i < week; i++) {
					System.out.print("	");
				}
			}
			
			//����ѭ����ӡʣ�����ڣ���ÿ����������
			if (week == 6) {
				System.out.printf("%3d\n",today.getDayOfMonth());
			} else {
				System.out.printf("%3s",today.getDayOfMonth()+"	");//��ʽ������ַ������������Ϊ1λ��������Ϊ2λ�Ķ�������
			}
			today = today.plusDays(1);//����
		}
		
		

	}
	
	

}
