package extra;
//ʵ���������������ݼ�ļӷ�
//˼·����
//	1��������������������������������Ȳ��ȣ����轫�϶̵ĸ�����0
//	2���Զ��尴λ�Ķ����������㷽������λȡ�ò�����������ÿһλ,��1ÿһλ+��2��Ӧλ+��λ >= 2,�������λΪ0������λ=1���������λΪ1��0����λ=0.
//						       ��������λ�Ե���1�������ڵ�����ǰ��һ����1����!!�����Ϊappend����������������ӣ��������õ����ַ�����Ҫ��������
//	3������2�з������ó������

public class BinaryAdd2 {
	public static void main(String[] args) {
		System.out.println(new BinaryAdd2().Operatre("11111","1111"));
	}		
	
	public String Operatre(String str1,String str2){
		//˼·������1
		while(str1.length() != str2.length()){
			if(str1.length() < str2.length()){
				str1 = "0" +str1;
			}
			else{
				str2 = "0" +str1;
			}
		}
		//˼·������2:
		StringBuilder result = new StringBuilder();//�ɱ��ַ����洢���
		int carry = 0;								//�洢��λ
		
		for (int i = str1.length()-1; i >= 0; i--) {
			int ChNum1 = str1.charAt(i) - '0';
			int ChNum2 = str2.charAt(i) - '0';
			if(ChNum1+ChNum2+carry >= 2){
				result.append("0");
				carry = 1;
			}
			else{
				result.append(String.valueOf(ChNum1+ChNum2+carry)); //�˼�д�ɲ��ط��������ChNum1+ChNum2+carryΪ0��Ϊ1
				carry = 0;
			}
			//�۲����������̣�System.out.println(ChNum1+" "+ChNum2+" "+result);
		}
		
		//�����ս�λ��Ϊ1��������1
		if (carry == 1) {
			result.append("1");
		}
		
		return result.reverse().toString();
	}
	
	
}
