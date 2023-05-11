package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동타입변환
		vehicle.run(); //오버라이드된 메소드 실행
//		vehicel.checkFare(); // 자식의 클래스 고유의 메소드, 필드는 실행이 안된다. => 강제타입 변환해야함
		
		//강제타입변환
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
