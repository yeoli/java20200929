package chap05.exercises;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("입력> ");
//		String str = scanner.nextLine();
//		int val = Integer.valueOf(str);
//		String str = scanner.nextLine();
//		double val = Double.valueOf(str);
//		
//		System.out.println("출력> ");
//		System.out.println(str);
//		System.out.println(val);
//		
//		System.out.println("정수입력>");
//		val = scanner.nextInt();
//		
//		System.out.println("정수출력>");
//		System.out.println(val);
		
//TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println(Integer.MIN_VALUE);
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores[" + i + "]>");
					int score = scanner.nextInt();
					scores[i]=score;
				}
			}else if(selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;

				for(int i=0; i<scores.length; i++) {
					max = max>scores[i] ? max : scores[i];
					sum += scores[i];
				}
				
				avg = sum/scores.length;
				
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);
				
			}else if(selectNo == 5) {
				run = false;
			}
	}
		
		    System.out.println("프로그램 종료");
				
			}
		}
