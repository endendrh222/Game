package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = new Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}
