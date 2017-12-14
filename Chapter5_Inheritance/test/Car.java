package test;

public class Car extends Cars{

	Car(int id,String name) {
		this.setId(id);
		this.setName(name);
	}
	
	public int Calculate(int[] arr,int input1) {
		int sum=0;
		for (int i : arr) {
			if(i == getId()) sum = input1*this.getId();
		}
		
		return sum;
	}

}
