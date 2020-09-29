package chap02.type.casting;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primitive type 8개
		
		//10byte 2byte 4byte 8bte
		//boolean char 
		//byte    short int long float double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		
		// 자동 형 변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		
		//r강제 형 변환
		longValue = 3333;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		//자동형변환(정수->실수)
		float floatValue = 0.0F;
	    double doubleValue = 0.0;
	    
	    doubleValue = intValue;
	    floatValue = intValue;
	    
	    floatValue = longValue;
	    
	    doubleValue = longValue;
	    
	    //강제 형변환(실수 -> 정수)
	    intValue = (int) floatValue;
	}

}
