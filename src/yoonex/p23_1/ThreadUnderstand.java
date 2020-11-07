package yoonex.p23_1;

class ShowThread extends Thread{
	String threadName;
	
	public ShowThread(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println(threadName);
			try {
				sleep(300);//1000초가 1초, 300은 0.3초
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadUnderstand {
	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("멋진 쓰레드");
		ShowThread st2 = new ShowThread("예쁜 쓰레드");
		st1.start();
		st2.start();
	}
}
