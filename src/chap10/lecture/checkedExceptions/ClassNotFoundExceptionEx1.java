package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		
	System.out.println("프로그램 실행1");
	
	try	{
			System.out.println("프로그램 실행 try 1");
			
			Class.forName("java.lang.Strings");
			System.out.println("프로그램 실행 try 2");
	  } catch (ClassNotFoundException e) {
		   	System.out.println("익셉션 발생!");
	  }
	
	System.out.println("프로그램 실행2");
	}
}
