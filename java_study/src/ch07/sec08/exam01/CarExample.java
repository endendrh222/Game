package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new KumhoTire(); //자동타입 변환 실시
		myCar.run();
	}

}