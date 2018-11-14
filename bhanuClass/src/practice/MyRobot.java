package practice;


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class MyRobot {
//launching notepad using Robot class
	public static void main(String[] args) throws Exception {
		Robot r=new Robot();
		Runtime.getRuntime().exec("notepad");
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_I);		
		/*for(int i=1;i<100;i=i+10) {
		r.mouseMove(200+i, 150);
		Thread.sleep(2000);
		}*/
	}

}
