package yoonex.p21_2;

interface SimpleInterface {
	public void showYourName();
}

class UpperClass {
	public void showYourAncestor() {
		System.out.println("UpperClass");
	}
}

class AAA1 extends UpperClass implements SimpleInterface{
	@Override
	public void showYourName() {
		// TODO Auto-generated method stub
		System.out.println("Class AAA");
	}
}

class BBB1 extends UpperClass implements SimpleInterface{
	@Override
	public void showYourName() {
		// TODO Auto-generated method stub
		System.out.println("Class BBB");
	}
}

public class BoundedTypeParam {
	public static <T> void showInstanceAncestor(T param) {
		((SimpleInterface)param).showYourName();
	}
	
	public static <T> void showInstanceName(T param) {
		((UpperClass)param).showYourAncestor();
	}
	
	public static void main(String[] args) {
		AAA1 aaa = new AAA1();
		BBB1 bbb = new BBB1();
		
		showInstanceAncestor(aaa);
		showInstanceName(aaa);
		showInstanceAncestor(bbb);
		showInstanceName(bbb);
	}
}
