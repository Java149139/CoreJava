package bigNumber_9;
import java.math.BigInteger;
import java.util.Scanner;
/*
 �������������򸡵����޷����㾫��Ҫ��ʱ������ʹ�ô���ֵ��
 	BigInteger���Դ������⾫�ȵ�����
	BigDecimal���Դ������⾫�ȵĸ�����
 */

public class BigNumber {
	public static void main(String[] args) {
		System.out.println("������һ�������ܴ��ֵ��");
		Scanner in = new Scanner(System.in);
		BigInteger bigNum = BigInteger.valueOf(in.nextLong());
		in.close();
		
		//�Ӽ��˳���ȡ�ࡢ�Ƚ����
		BigInteger num = BigInteger.valueOf(1000000000); //ע�⣬10000000000��10��0���ǳ�����Χ�ģ������ô���ֵȴ����ʵ������1000000000��9��0�����
		System.out.println("�Դ���ֵ�ļӷ���"+bigNum.add(num)+"�Դ���ֵ�ļ�����"
				+bigNum.subtract(num)+"�Դ���ֵ�ĳ˷���"+bigNum.multiply(num)+"�Դ���ֵ�ĳ�����"+bigNum.divide(num)
				+"�Դ���ֵ��ȡ�ࣺ"+bigNum.mod(num));
		System.out.println("�Դ���ֵ�ıȽ���ȣ�"+bigNum.compareTo(num)); //��bigNum����num������int��0����С�ڣ����ظ��������򣬷�������
	}
}
