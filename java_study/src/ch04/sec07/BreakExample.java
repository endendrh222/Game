package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int) (Math.random()*6) + 1;
			int num2 = (int) (Math.random()*6) + 1;
			System.out.println("(눈 "+ num + ",눈 " + num2 + ")" + "총합 : " + (num + num2));
			System.out.println(num2);
			
			if(num + num2 ==3) {
				break;
			}
		}
	}

}
