package ch04_sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=1; m<=6; m++) {
			System.out.println("***" + m + "단***");
			for (int n=1; n<=6; n++) {
				System.out.println(m + "x" + n + "=" + (m+n));
			}
		}
	}

}
