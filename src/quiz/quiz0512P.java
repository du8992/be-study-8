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
		 
		 
		 
		 
		
	}
}