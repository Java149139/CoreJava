package extra;
//ʵ����������Ķ��������ݼ�ļӷ�
//˼·һ��������Ķ�������ת��Ϊʮ���ƣ�������������ת��Ϊ���������
import java.util.Scanner;
public class BinaryAdd1 {
	public static void main(String[] args) {
		Scanner();
		new BinaryAdd1().function();
	}
	
	//ȫ�ֱ������ڴ洢��ȡ��������ֵ
	static String str1, str2;
	
	//��������ȡ��������ֵ
	public static void Scanner() {
		Scanner in = new Scanner(System.in);
		System.out.println("�����루�����ƣ�����һ");
		str1 = in.nextLine();
		System.out.println("�����루�����ƣ����ֶ�");
		str2 = in.nextLine();
		in.close();
	}
	
	//�������Զ�����ж����������Ƿ�Ϊ��������
	public boolean isBinary1(String str){
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)-'0' > 1) {
				return false;
			}
		}
		return true;
	}
	
	//�������ж������Ƿ�Ϸ������Ϸ�������ȡֵת��Ϊint��ʮ���Ƽ����������ٰ����������
	public void function() {
		if(isBinary1(str1) && isBinary1(str2)){
			int num1 = Integer.parseInt(str1, 2);
			int num2 = Integer.parseInt(str2, 2);
			System.out.println("�������Ķ����Ʊ�ʾΪ��"+Integer.toBinaryString(num1+num2));
		}
		else{
			System.out.println("���������������!");
		}
	}
}
