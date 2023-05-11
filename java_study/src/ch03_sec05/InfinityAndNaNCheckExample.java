package ch03_sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		String a = "abc";
		
		System.out.println(z + 2);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출불가");
		} 
		
		if(Double.isNaN(Double.parseDouble(a))){
			System.out.println("숫자가 아님");
		}
	}

}
