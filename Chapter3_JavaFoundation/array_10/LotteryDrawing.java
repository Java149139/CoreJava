package array_10;
//�������������M�ķ�Χ�ڣ�����N����N�ɼ������룩���������N�������������ظ����γɲ�Ʊ�齱����

/*
 ˼·һ������Math.random()*M������[0��M)���������������⣬���ظ��������������ظ������洢����
 ˼·��������Math.random()*M������[0��M)�����������Ϊ�±�ȥȡ�洢[0��M)�����������ֵ,����洢���顣
Ϊ�����ظ��� ȡ��ֵ�󣬽�������ԭ�±��Ӧֵ��Ϊ���������һλ�����±�ΪM-1��������M--��
 */

import java.util.Scanner;

public class LotteryDrawing {
	public static void main(String[] args) {
		new LotteryDrawing().Random();
	}
	
	//˼·һ
	private void Random() {
		int numM = 0, numN = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("����������Ҫ��ȡֵ��Χ");
		numM = in.nextInt();
		System.out.println("����������Ҫ�����������");
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
