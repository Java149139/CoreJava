package dataType_3;
//�����Ʊ�ʾ���Ӧ�������

public class BinarySystem {
    public static void main(String[ ] args){
    		 	
    	int n = 0x1F;
    	int num = (n & (1 << 3)) >> 3;
    	System.out.println(Integer.toHexString(num));
    	System.out.println(-1>>>2);
    	System.out.println(new BinarySystem().method(2,30));
    	System.out.println(Integer.toBinaryString(-1>>>2));
    	System.out.println(Integer.toBinaryString(new BinarySystem().method(2,30)));
    }
    
    //��������num��������mi�η������÷�����Math.pow(x,a),x��a����
    public int method(int num,int mi){
    	int sum = 1;  	
		for (int i = 0; i < mi; i++) {
			sum *= num;
		}
		return sum;
	}
}