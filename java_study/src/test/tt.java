package test;

public class tt {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i<array.length; i++) {
			
			
			avg += array[i].length; //첫번째 반의 학생수와 두번째 반의 학생수를 더한다.
			
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
			}
		}
		
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum / avg));
		
		
		
	}

}

class Example {

	public static void max(int a[]) {
		for
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}
}

