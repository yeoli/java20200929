package chap11.string;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charAt
		String str1 = "java";
		char c1 = str1.charAt(2);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		
		//equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2 == str6);
		System.out.println(str2.equals(str6));
		
		//indexOf
		String str7 = "자바 프로그래밍";
		int e = str7.indexOf("프로");
		System.out.println(e);

		
		//length
		String str8 = "이것이 자바다.";
		System.out.println(str8.length());
		int l = str8.length();
		System.out.println(str8.charAt(l-1));
		//마지막 문자 구하기
		
		//replace
		String str9 = "abcdefabcdefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		System.out.println(str9);
		
		//substring
		String str11 = "0123456789";
		String sub = str11.substring(4,6);
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(str11.length());
		System.out.println(sub);
		
		sub = str11.substring(6);
		System.out.println(sub);
		
		//trim
		String str12 = "  ja  va  ";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
	}

}
