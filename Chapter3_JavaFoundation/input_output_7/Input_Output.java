package input_output_7;
//�����ȡ���ʽ�����
import java.util.Scanner;

public class Input_Output {
	public static void main(String[] args){
		new Input_Output().Input();
		new Input_Output().Printf();
	}
	//�����ȡ
	public void Input(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("�������������Կո�����");		
		String Next = in.nextLine(); //��Ҫ��ȡ����������һ�еĶ�ȡ����ʹ��next(),����next()��ȡ����ֱ���������еĶ�ȡ
		System.out.print("�������������Կո�����");
		String NextLine = in.next();
		in.close();
		
		System.out.println("in.NextLine():"+Next+" "+"in.Next():"+NextLine);
	}
	//��ʽ�����
	public void Printf(){
		//��־+���+����+ת����
		System.out.printf("��������ŵġ�����ǰ��0���ܿ��Ϊ8��������λ��С���㣩������Ϊ2�ġ�-10.0/3.0���Ľ��,����У� %+08.2f\n", -10.0/3.0);
		System.out.println("֤���ѻ���");
	}
	
}

