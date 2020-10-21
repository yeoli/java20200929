package chap11.object.toString;

public class MyClass {
	private int age;
	private String name;
	private String password;
	
	public void setFields(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "마이클래스 객체";
	}
}
