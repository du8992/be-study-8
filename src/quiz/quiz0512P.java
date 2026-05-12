package quiz;
import java.util.Scanner;

public class quiz0512P {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =0;
		int a = 0;
		/*
		for (int i = 1; i <4; i ++) {
			 if(i == 1) {
				 System.out.println("국어점수 : ");
				 int score = sc.nextInt();
				 num = num + score;
				 if (score < 41) {
					 a++;
				 }
			 }
			 else if(i == 2) {
				 System.out.println("수학점수 : ");
				 int score = sc.nextInt();
				 num = num + score;
				 if( score < 41) {
					 a++;
				 }
			 }
			 else {
				 System.out.println("영어점수 : ");
				 int score = sc.nextInt();
				 num = num + score;
				 if (score < 41) {
					 a++;
				 }
			 }
		}
		
		if (a >= 1 || num < 180) {
			System.out.println("불합격입니다.");
		}
		else {
			System.out.println("축하합니다, 합격입니다!");
		}
		*/
		
		int i = 1;
		int korean =0, math =0, english = 0;
		while(i < 4) {
		
			if(i == 1) {
				 System.out.println("국어점수 : ");
				 int score = sc.nextInt();
				 num = num + score;
				 korean = score;
				 if (score < 41) {
					 a++;
				 }
			 }
			 else if(i == 2) {
				 System.out.println("수학점수 : ");
				 int score = sc.nextInt();
				 num = num + score;
				 math = score;
				 if( score < 41) {
					 a++;
				 }
			 }
			 else {
				 System.out.println("영어점수 : ");
				 int score = sc.nextInt();
				 num = num + score;
				 english = score;
				 if (score < 41) {
					 a++;
				 }
			 }
			i++;
		}
		
		
		double y = num/3.0;
		System.out.println("국어 : " + korean);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + english);
		System.out.println("합계 : " + num);
		System.out.println("평균 : " + y);
		
		if (a >= 1 || y < 60) {
			System.out.println("불합격입니다.");
		}
		else {
			System.out.println("축하합니다, 합격입니다!");
		}
		 
		
		// 1) i가 0~10으로 11번 반복
		for (i = 0; i <= 10; i++) {
			
			
		}

		// 2) i가 1~9로 9번 반복
		for (i = 1; i < 10; i++) { 
			
		}

		// 3) i가 10 ~ 100 으로 10씩 증가하며 10번 반복
		for (i = 10; i <= 100; i += 10) { 
			
		}

		// 4) i가 25 50 75 100 해서 4번 반복
		for (i = 25; i <= 100; i += 25) { 
			
		}

		
		
		// 5) i가 50 ~ 55로 6번 반복
		 i = 50;
		while (i <= 55) { 
			i++; 
			}

		// 6) i가 10 ~ 1로 10번 반복
		 i = 10;
		while (i >= 1) { 
			i--; 
			}

		// 7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복 (30, 25, 20, 15, 10, 5, 0)
		i = 30;
		while (i >= 0) { 
			i -= 5;
			}

		// 8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복 (30, 25, 20, 15, 10, 5)
		i = 30;
		while (i >= 5) { 
			i -= 5; 
			}

		// 9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복 (25, 20, 15, 10, 5, 0)
		i = 25;
		while (i >= 0) {
			i -= 5; 
			}

		 
		 
		
	}
}