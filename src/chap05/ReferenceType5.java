package chap05;

public class ReferenceType5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "java";
		
		str2 = null;
		
		System.out.println(str1);
		System.out.println(str2);
		
		//java virtul machine 이 
		//gabage collector(gc)가 불필요한 인스턴스를 모아 제거함

	}

}
