package ch07.sec04.exam01;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
//		System.out.println("Computer 객처의 areaCircle() 실행");
		return super.areaCircle(r);
	}

	//오버라이드: 리턴타입, 메소드 이름, 매개변수는 다 같고 내부 실행코드는 다르다.
	
}
