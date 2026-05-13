package quiz;
import java.util.Scanner;

public class quiz0513P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 1\n");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 ==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		System.out.println("\n문제 2\n");
		int num1 = sc.nextInt();
		if (num1 % 7 ==0) {
			System.out.println("7의 배수입니다");
		}
		else {
			System.out.println("아닙니다");
		}
		
		System.out.println("\n문제 3\n");
		int num2 = 0;
		for(int i = 1; i <=1000; i++) {
			if (i % 5 ==0) {
				num2 = num2 + i;
			}
		}
		System.out.println(num2);
		
		System.out.println("\n문제 4\n");
		
		int num10 = sc.nextInt();
		
			if (num10 < 51) {
			for (int j = 1; j <= num10; j++) {
				 System.out.print("*");
			}
			}
			else {
				 System.out.print("잘못입력했습니다\n");
			}
		
		
		
		System.out.println("\n문제 5\n");
		int num3 = 0;
		for(int i = 1; i <=10; i++) {
			if (i % 2 ==0) {
				num3 = num3 - i;
			}
			else {
				num3 = num3 + i;
			}
		}
		System.out.println(num3);
		
		
		System.out.println("\n문제 6\n");
		int num4 = 0;
		for (int i = 1; i < 1000; i++) {
			num4 += i;
		    if (num4 >= 1000) { 
		        break;
		    }
		    
		}

		System.out.println(num4);
		
		
		System.out.println("\n문제 7\n");
		int num5 = sc.nextInt();
		for (int i =1; i <10; i++) {
			System.out.println(num5 + " * "+ i + " = " +(num5 * i));
		}
	}
	
		

}
