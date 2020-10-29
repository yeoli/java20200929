package chap12.textbook.s120202;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
	// TODO Auto-generated method stub
	Toolkit tookit = Toolkit.getDefaultToolkit();
	for(int i =0; i<5; i++) {
		tookit.beep();
		try { 
			Thread.sleep(500);
		}catch(Exception e) {}
	}
 }
}
