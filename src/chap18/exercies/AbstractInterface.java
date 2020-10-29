package chap18.exercies;

abstract class PersonalNumberStorage
{
	public abstract void addPersonalInfo(String name, String perNum);
	public abstract String searchName(String perNum);
}

class PersonalNumInfo{
	String name;
	String number;
	
	PersonalNumInfo(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	String getName() { return name; }
	String getNumber() { return number; } 
}

class PersonalNumberStorageImp1 extends PersonalNumberStorage{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImp1(int sz) {
		perArr = new PersonalNumInfo[sz];
		numOfPerInfo=0;
	}
	
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;
	}
	
	public String searchName(String perNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
		}
		return null;
	}
}

public class AbstractInterface {
	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImp1(100);
		storage.addPersonalInfo("김기동", "090900-332342");
		storage.addPersonalInfo("김d동", "032550-323342");
		
		System.out.println(storage.searchName("090900-332342"));
		System.out.println(storage.searchName("032550-323342"));
	}
}
