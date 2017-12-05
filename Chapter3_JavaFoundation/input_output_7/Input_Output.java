package input_output_7;
//输入读取与格式化输出
import java.util.Scanner;

public class Input_Output {
	public static void main(String[] args){
		new Input_Output().Input();
		new Input_Output().Printf();
	}
	//输入读取
	public void Input(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("输入两个数，以空格间隔：");		
		String Next = in.nextLine(); //若要读取多行数，第一行的读取不可使用next(),否则next()读取完后会直接跳过下行的读取
		System.out.print("输入两个数，以空格间隔：");
		String NextLine = in.next();
		in.close();
		
		System.out.println("in.NextLine():"+Next+" "+"in.Next():"+NextLine);
	}
	//格式化输出
	public void Printf(){
		//标志+宽度+精度+转换符
		System.out.printf("输出带符号的、数字前补0、总宽度为8（含符号位与小数点）、精度为2的“-10.0/3.0”的结果,最后换行： %+08.2f\n", -10.0/3.0);
		System.out.println("证明已换行");
	}
	
}

