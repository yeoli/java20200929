package chap03.test;

public class P4_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		int bitset = 1 << 30;
		num |= bitset;
		System.out.println(num);
		System.out.println(num << 1);

	}

}
