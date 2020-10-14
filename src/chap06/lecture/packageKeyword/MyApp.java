package chap06.lecture.packageKeyword;
import java.util.ArrayList;
import java.util.Scanner;



public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 = 
				new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		java.lang.String str = "Java";
		String str2 = "css";
		
		ArrayList list = new ArrayList();
	}
}
