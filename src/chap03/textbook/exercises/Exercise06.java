package chap03.textbook.exercises;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom)*height)*0.5; //2로 나누면 int가 double로 되서 52.0 나오지만 
		                                                       //0.5면 double형이므로 int가 double로 되서 double결과가 double에 저장
		System.out.println(area);
				

	}

}
