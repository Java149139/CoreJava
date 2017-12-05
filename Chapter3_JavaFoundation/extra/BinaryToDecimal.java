package extra;
//自定义的二进制转换为十进制方法
//思路：取得二进制数每一位的数字，然后按位计算次幂，最后求和
	//系统内置转换方法：int num = Integer.parseInt("1101",2);

public class BinaryToDecimal {
	public static void main(String[] args) {
		System.out.println("二进制“0”转换为十进制为："+Conversion(0));
		System.out.println("二进制“1101”转换为十进制为："+Conversion(1101));
	}
	
	public static int Conversion(int BinaryNum) {
		int i = 0,result = 0;
		//利用不断/10与%10取得各个位的数字
			//思路二：还可利用String.charAt(i)取得，详见BinaryAdd1类的isBinary1方法
		while(BinaryNum != 0){
			double num =BinaryNum % 10;
			result += num*Math.pow(2, i);
			i++;
			BinaryNum = BinaryNum / 10;
		}
		
		return result;
	}
}
