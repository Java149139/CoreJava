package extra;
//实现两个二进制数据间的加法
//思路二：
//	1，处理两个参与运算的数：若两数长度不等，则需将较短的该数左补0
//	2，自定义按位的二进制数运算方法：按位取得参与运算数的每一位,数1每一位+数2对应位+进位 >= 2,则得数该位为0，并进位=1；否则该数位为1或0，进位=0.
//						       且若最后进位仍等于1，还需在得数面前加一个“1”。!!最后，因为append（）总是在最右添加，所以组后得到的字符串需要倒过来。
//	3，调用2中方法，得出结果。

public class BinaryAdd2 {
	public static void main(String[] args) {
		System.out.println(new BinaryAdd2().Operatre("11111","1111"));
	}		
	
	public String Operatre(String str1,String str2){
		//思路二步骤1
		while(str1.length() != str2.length()){
			if(str1.length() < str2.length()){
				str1 = "0" +str1;
			}
			else{
				str2 = "0" +str1;
			}
		}
		//思路二步骤2:
		StringBuilder result = new StringBuilder();//可变字符串存储结果
		int carry = 0;								//存储进位
		
		for (int i = str1.length()-1; i >= 0; i--) {
			int ChNum1 = str1.charAt(i) - '0';
			int ChNum2 = str2.charAt(i) - '0';
			if(ChNum1+ChNum2+carry >= 2){
				result.append("0");
				carry = 1;
			}
			else{
				result.append(String.valueOf(ChNum1+ChNum2+carry)); //此简写可不必分情况讨论ChNum1+ChNum2+carry为0或为1
				carry = 0;
			}
			//观察具体运算过程：System.out.println(ChNum1+" "+ChNum2+" "+result);
		}
		
		//若最终进位仍为1，则需左补1
		if (carry == 1) {
			result.append("1");
		}
		
		return result.reverse().toString();
	}
	
	
}
