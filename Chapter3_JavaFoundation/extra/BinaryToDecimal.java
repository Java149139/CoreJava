package extra;
//�Զ���Ķ�����ת��Ϊʮ���Ʒ���
//˼·��ȡ�ö�������ÿһλ�����֣�Ȼ��λ������ݣ�������
	//ϵͳ����ת��������int num = Integer.parseInt("1101",2);

public class BinaryToDecimal {
	public static void main(String[] args) {
		System.out.println("�����ơ�0��ת��Ϊʮ����Ϊ��"+Conversion(0));
		System.out.println("�����ơ�1101��ת��Ϊʮ����Ϊ��"+Conversion(1101));
	}
	
	public static int Conversion(int BinaryNum) {
		int i = 0,result = 0;
		//���ò���/10��%10ȡ�ø���λ������
			//˼·������������String.charAt(i)ȡ�ã����BinaryAdd1���isBinary1����
		while(BinaryNum != 0){
			double num =BinaryNum % 10;
			result += num*Math.pow(2, i);
			i++;
			BinaryNum = BinaryNum / 10;
		}
		
		return result;
	}
}
