package extra;
//实现两个输入的二进制数据间的加法
//思路一：将输入的二进制数转换为十进制，运算出结果，再转换为二进制输出
import java.util.Scanner;
public class BinaryAdd1 {
	public static void main(String[] args) {
		Scanner();
		new BinaryAdd1().function();
	}
	
	//全局变量用于存储读取到的输入值
	static String str1, str2;
	
	//方法：读取两个输入值
	public static void Scanner() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入（二进制）数字一");
		str1 = in.nextLine();
		System.out.println("请输入（二进制）数字二");
		str2 = in.nextLine();
		in.close();
	}
	
	//方法：自定义的判断所输入数是否为二进制数
	public boolean isBinary1(String str){
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)-'0' > 1) {
				return false;
			}
		}
		return true;
	}
	
	//方法：判断输入是否合法。若合法，将读取值转换为int型十进制计算出结果后，再按二进制输出
	public void function() {
		if(isBinary1(str1) && isBinary1(str2)){
			int num1 = Integer.parseInt(str1, 2);
			int num2 = Integer.parseInt(str2, 2);
			System.out.println("运算结果的二进制表示为："+Integer.toBinaryString(num1+num2));
		}
		else{
			System.out.println("请输入二进制数字!");
		}
	}
}
