package chap06.textbook.s060804;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 =" + result1);
		System.out.println("정사각형 넓이 =" + result2);
		

	}

}
