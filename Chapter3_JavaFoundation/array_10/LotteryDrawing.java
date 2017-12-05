package array_10;
//需求：在输入的数M的范围内，产生N个（N由键盘输入）随机数，这N个数两两不能重复。形成彩票抽奖号码

/*
 思路一：利用Math.random()*M，产生[0，M)的随机数，遍历检测，若重复则舍弃，若不重复则存入存储数组
 思路二：利用Math.random()*M，产生[0，M)的随机数，作为下标去取存储[0，M)的整型数组的值,存入存储数组。
为避免重复： 取得值后，将该数组原下标对应值改为该数组最后一位数（下标为M-1），并将M--。
 */

import java.util.Scanner;

public class LotteryDrawing {
	public static void main(String[] args) {
		new LotteryDrawing().Random();
	}
	
	//思路一
	private void Random() {
		int numM = 0, numN = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您想要的取值范围");
		numM = in.nextInt();
		System.out.println("请输入您想要的随机数个数");
		numN = in.nextInt();
		in.close();
		
		int[] num = new int[numN];
		int tag = 0, count = 0;

		while (count != numN) {
			int tmp = (int) (Math.random() * numM);
			for (int i : num) {
				if (tmp == i) {
					tag = 1;
					break;
				}
			}
			if (tag == 0) {
				num[count] = tmp;
				count++;
			}
		}

		for (int i : num) {
			System.out.println(i);
		}
	}

}
