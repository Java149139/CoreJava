package test;

public class CarTest {

	public static void main(String[] args) {
		int input1 = 10;
		int[] arr = {0,1,2,2};
		Car aCar = new Car(2, "�γ�");
		
		System.out.println("id�ǣ�"+aCar.getId());
		System.out.println("�������ǣ�"+aCar.Calculate(arr,input1));
	}

}
