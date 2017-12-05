package bigNumber_9;
import java.math.BigInteger;
import java.util.Scanner;
/*
 当基本的整数或浮点数无法满足精度要求时，可以使用大数值：
 	BigInteger可以处理任意精度的整数
	BigDecimal可以处理任意精度的浮点数
 */

public class BigNumber {
	public static void main(String[] args) {
		System.out.println("请输入一个尽可能大的值：");
		Scanner in = new Scanner(System.in);
		BigInteger bigNum = BigInteger.valueOf(in.nextLong());
		in.close();
		
		//加减乘除、取余、比较相等
		BigInteger num = BigInteger.valueOf(1000000000); //注意，10000000000（10个0）是超出范围的，但是用大数值却可以实现两个1000000000（9个0）相乘
		System.out.println("对大数值的加法："+bigNum.add(num)+"对大数值的减法："
				+bigNum.subtract(num)+"对大数值的乘法："+bigNum.multiply(num)+"对大数值的除法："+bigNum.divide(num)
				+"对大数值的取余："+bigNum.mod(num));
		System.out.println("对大数值的比较相等："+bigNum.compareTo(num)); //若bigNum等于num，返回int型0；若小于，返回负数；否则，返回正数
	}
}
