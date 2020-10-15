package PhoneBook;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class PhoneInfo{
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name, String phoneNumber, String birth) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = null;
	}	
	
	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		if(birth!=null) {
			System.out.println("birth : " + birth);
		}
	}
	
}

class PhoneBookManager {
	
	final static int MAX_CNT = 100;
	static PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	static int curCnt = 0;
	
	public static void inputData() {
		System.out.println("데이터 입력을 시작합니다..");
		
		System.out.print("이름: ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("생년원일: ");
		String birth = MenuViewer.sc.nextLine();
		
		infoStorage[curCnt++] = new PhoneInfo(name, phoneNumber, birth);
		System.out.println("데이터 입력이 완료되었습니다. \n");
		}
	
		public void searchData() {
			System.out.println("데이터 검색을 시작합니다..");
			
			System.out.println("이름 : ");
			String name = MenuViewer.sc.nextLine();
			
			int dataIdx = search(name);
			if(dataIdx<0) {
				System.out.println("해당하는 데이터가 존재하지 않습니다.");
			}
			else {
				infoStorage[dataIdx].showPhoneInfo();
				System.out.println("데이터 검색이 완료되었습니다.");
			}
		}
		
		public static void deleteData() {
			System.out.println("데이터 삭제를 시작합니다..");
			
			System.out.println("이름: ");
			String name = MenuViewer.sc.nextLine();
			
			int dataIdx = search(name);
			if(dataIdx<0) {
				System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
			}else {
				for(int idx = dataIdx; idx<(curCnt-1); idx++)
					infoStorage[idx] = infoStorage[idx+1];
				
				curCnt--;
				System.out.println("데이터 삭제가 완료되었습니다. \n");
			}
		}
		
		private static int search(String name) {
			for(int idx=0; idx<curCnt; idx++) {
				PhoneInfo curInfo = infoStorage[idx];
				if(name.compareTo(curInfo.name)==0)
					return idx;
			}
			return -1;
		}
}

class MenuViewer{	
		public static Scanner sc = new Scanner(System.in);
		
		public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.프로그램 종료");
		System.out.print("선택 : ");
		}
	}

class PhoneBookVer02 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PhoneBookManager pb = new PhoneBookManager();
		int chice;
		
		while(true) {
			MenuViewer.showMenu();
			chice = MenuViewer.sc.nextInt();
			MenuViewer.sc.nextLine();
			
			switch(chice) {
			case 1 : 
				pb.inputData();
				break;
			case 2 :
				pb.searchData();
				break;
			case 3 :
				pb.deleteData();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}
	}
	
}
