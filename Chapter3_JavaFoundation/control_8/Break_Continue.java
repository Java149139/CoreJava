package control_8;
import java.util.Scanner;
//����ǩ����ֵ�ı仯��Ҳ��ʵ���������ܣ����ɱ����������Ĵ��󣬹ʲ�����ʹ���������

//break��continue������
//����ǩ��break��continue���
//�κ�һ��ʹ�����������ģ���������ѭ����������������ִ�����

public class Break_Continue {
	public static void main(String[] args) {
		int num = 0;
		
		//break��continue������
		for (int i = 0; i < 10; i++) {
			System.out.println("���������0��һ������");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			//if(num < 0 ) break; break��ֱ����������ѭ��
			//if(num < 0 ) continue; continue�����Թ�ѭ��ʣ�ಿ�֣�ֱ������ѭ�����²��֡�i++����
			System.out.println("��������ǣ�"+num);
			in.close();
		}
		
		//����ǩ��break��continue���(����ָ����ǩ��):
		break_tag:
		for (int i = 0; i < 10; i++) {
			if (num < 0) break break_tag;
		}
		
		//�κ�һ��ʹ�����������ģ���������ѭ����������������ִ����ϣ�
		if (num < 0) {
			//��ʾ��ѭ�������ģ�Ӧ������������
		}
		else {
			//��ʾ����ѭ�������ģ�Ӧ������������
		}
}
	
		
}
