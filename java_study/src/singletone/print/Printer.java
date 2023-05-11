package singletone.print;

public class Printer {
	//필드
	private static Printer printer = null;
	
	//생성자
	private Printer() {}

	public static Printer getPrinter() {
		if(printer == null) {
			
		//  printer 필드를 맨 처음 사용할땐 새로운 printer 인스턴스 생성    
			printer = new Printer(); 
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
