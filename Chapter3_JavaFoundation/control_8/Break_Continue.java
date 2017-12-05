package control_8;
import java.util.Scanner;
//检测标签标量值的变化，也可实现跳出功能，还可避免跳出语句的错误，故不建议使用跳出语句

//break与continue的区别
//带标签的break、continue语句
//任何一个使用了跳出语句的，都必须检测循环是跳出还是正常执行完毕

public class Break_Continue {
	public static void main(String[] args) {
		int num = 0;
		
		//break与continue的区别：
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入大于0的一个数：");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			//if(num < 0 ) break; break是直接跳出整个循环
			//if(num < 0 ) continue; continue则是略过循环剩余部分，直接跳到循环更新部分“i++”。
			System.out.println("您输入的是："+num);
			in.close();
		}
		
		//带标签的break、continue语句(跳到指定标签处):
		break_tag:
		for (int i = 0; i < 10; i++) {
			if (num < 0) break break_tag;
		}
		
		//任何一个使用了跳出语句的，都必须检测循环是跳出还是正常执行完毕：
		if (num < 0) {
			//表示是循环跳出的，应。。。。处理
		}
		else {
			//表示不是循环跳出的，应。。。。处理
		}
}
	
		
}
