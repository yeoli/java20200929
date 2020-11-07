package chap14;

import java.util.ArrayList;

public class Aryca {
	public static void main(String[] args) {
		ArrayList<Integer> ary = new ArrayList<>();
		ary.ensureCapacity(500);
		int n = ary.size();
		ary.ensureCapacity(n*2);
		
	}
	
}
