package dataType_3;

//�����������ͼ��ת��
public class DataType {
	public static void main(String[] args) {
		int CharNum = '3' - '2';
		char ch = 2 + '0';
		String string = String.valueOf(11101).substring(0, 3);//ע�����ַ����Ժν�β�����ַ�������Ϊ3-0
		System.out.println("ʮ���ơ�29��ת�����Ʊ�ʾΪ��"+Integer.toBinaryString(29));
		System.out.println("�����ơ�11101��תʮ���Ʊ�ʾΪ��"+Integer.parseInt("11101", 2));
		System.out.println(CharNum+" "+ch+" "+string);
	}
}
