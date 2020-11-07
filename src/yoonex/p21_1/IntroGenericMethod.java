package yoonex.p21_1;

class AAA {
	public String toString() {
		return "class AAA";
	} //object 메소드 오버라이딩
}

class BBB {
	public String toString() {
		return "class BBB";
	} 
}

class InstanceTypeshower {
	int showCnt = 0;
	
	public <T> void showInstType(T inst) {
		System.out.println(inst);
		showCnt++;
	}
	
	void showPrintCnt() {
		System.out.println("Show count : " + showCnt);
	}
}
public class IntroGenericMethod {
	public static void main(String[] args) {
		
	InstanceTypeshower is = new InstanceTypeshower();
	AAA a = new AAA();
	BBB b = new BBB();
	
	is.<AAA>showInstType(a); //AAA는 반환값이 아니라 인스턴스 a의 자료형이 AAA형
	is.<BBB>showInstType(b); //자료형 전달
	is.showPrintCnt();
	
	}
}
