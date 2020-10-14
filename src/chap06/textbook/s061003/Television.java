package chap06.textbook.s061003;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		model = "fff"; // static은 객체 생성 안됨=>생성자로 초기화 불가
		 			   // static{} 으로 초기화
		info = company + "-" + model;
	
	}
}
