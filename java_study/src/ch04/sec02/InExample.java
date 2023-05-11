package ch04.sec02;

public class InExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) { //90점이상
			System.out.println("학점 A입니다.");
		}
		else if(score >= 80) { //80~89
			System.out.println("학점 B입니다.");
		}
		else if(score >= 70) { //70~79
			System.out.println("학점 C입니다.");
		}
		else { //69이하
			System.out.println("학점 D입니다.");
		}
		
	}

}
