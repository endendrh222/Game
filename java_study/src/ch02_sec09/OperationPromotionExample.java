package ch02_sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		//중요. byte, short, char끼리 연산하면 int로 따라간다. => int 타입에 결과값을 담아야 한다.
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		
		//중요. 타입이 다양한 변수끼리 연산시 허용범위가 큰타입으로 따라간다. => 허용범위가 큰 타입에 결과값을 담아야 한다.
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		
		System.out.println("result3: " + result3);

		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println(result4);
		
		int v8 = 10;
		double result5 = v8 / 4;
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = v9 /4.0;
		
		System.out.println(result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double)v10 / v11;
		System.out.println(result7);
	}

}
