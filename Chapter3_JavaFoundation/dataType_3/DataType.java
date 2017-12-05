package dataType_3;

//各种数据类型间的转换
public class DataType {
	public static void main(String[] args) {
		int CharNum = '3' - '2';
		char ch = 2 + '0';
		String string = String.valueOf(11101).substring(0, 3);//注意新字符串以何结尾，新字符串长度为3-0
		System.out.println("十进制“29”转二进制表示为："+Integer.toBinaryString(29));
		System.out.println("二进制“11101”转十进制表示为："+Integer.parseInt("11101", 2));
		System.out.println(CharNum+" "+ch+" "+string);
	}
}
