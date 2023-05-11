package java_modeling.ch01.asso3;

public class Main {

	public static void main(String[] args) {
		//학생 두명 생성
		Student haseo = new Student("haseo");
		Student gildong = new Student("gildong");
		
		//과목 2개 생성
		Course java = new Course("java");
		Course dp = new Course("Design pattern");
		
		//성적객체 => 수강신청도 동시에 발생
		Transcript t1 = new Transcript(haseo, java); //하서는 자바를 수강 신청
		Transcript t2 = new Transcript(haseo, dp); 
		Transcript t3 = new Transcript(gildong, dp ); //길동은 자바를 수강 신청
		
		t1.setDate("2023-05-04");
		t1.setGrade("B");
	
		t2.setDate("2023-05-04");
		t2.setGrade("D+");

		t2.setDate("2023-05-04");
		t2.setGrade("C+");
	}

}
