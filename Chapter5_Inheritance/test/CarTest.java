package test;

public class CarTest {

	public static void main(String[] args) {
		int input1 = 10;
		int[] arr = {0,1,2,2};
		Car aCar = new Car(2, "轿车");
		
		System.out.println("id是："+aCar.getId());
		System.out.println("运算结果是："+aCar.Calculate(arr,input1));
	}

}
