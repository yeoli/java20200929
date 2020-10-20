//package PhoneBook.pb;
//
//import java.util.Scanner;
//
//class PhoneInfo{
//	String name;
//	String phoneNumber;
//	
//	public PhoneInfo(String name, String num) {
//		this.name = name;
//		phoneNumber = num;
//	}
//	
//	public void showPhoneInfo() {
//		System.out.println("name : " + name);
//		System.out.println("phone : " + phoneNumber);
//	}
//
//class PhoneUnivInfo extends PhoneInfo{
//	String major;
//	int year;
//	
//	public PhoneUnivInfo(String name, String num, String major, int year) {
//		super(name, num);
//		this.major = major;
//		this.year = year;
//		
//	}
//	
//	public void showPhoneInfo() {
//		super.showPhoneInfo();
//		System.out.println("major: " + major);
//		System.out.println("year: " + year);
//	}
//}
//
//class PhoneCompanyInfo extends PhoneInfo{
//	String company;
//
//	public PhoneCompanyInfo(String name, String num, String company) {
//		super(name, num);
//		this.company = company;
//	}
//	
//	public void showPhoneInfo() {
//		super.showPhoneInfo();
//		System.out.println("company: " + company);
//	}
//}
//
//class PhoneBookManager{
//	final int MAX_CNT = 100;
//	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
//	int curCnt = 0;
//	
//	private PhoneInfo readFriendInfo() {
//		System.out.println("이름 : ");
//		String name = MenuViewer.sc.nextLine();
//		System.out.println("전화번호 : ");
//		String phone = MenuViewer.sc.nextLine();
//		return new PhoneInfo(name, phone);
//	}
//	
//	private PhoneInfo readCompanyFriendInfo() {
//		System.out.println("이름: ");
//		String name = MenuViewer.sc.nextLine();
//		System.out.println("전화번호: ");
//	}
//}
//
//static class MenuViewer{
//	public static Scanner sc = new Scanner(System.in);
//	
//	public static void showMenu() {
//		System.out.println("선택하세요...");
//		System.out.println("1. 데이터 입력");
//		System.out.println("2. 데이터 검색");
//		System.out.println("3. 데이터 삭제");
//		System.out.println("4. 프로그램 종료");
//		System.out.println("선택 : ");
//	}
//}
//
//
//public class PhoneBookVer04 {
//	public static void main(String[] args) {
//		
//	}
//}
