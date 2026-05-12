package quiz;
import java.util.Scanner;

public class quiz0512 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("출생연도를 입력하세요: ");
		 int year = sc.nextInt();
		
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if (num < 1 || num >4) {
			System.out.println("잘못 입력하셨습니다");
		}
		else if (year < 1900 || year >2026) {
			System.out.println("잘못 입력하셨습니다");
		}
			
		else if (num == 1 || num == 3) {
			if (num == 1 && year > 1999) {
				System.out.println("잘못 입력하셨습니다");
			}
			else if (num == 3 && year <2000) {
				System.out.println("잘못 입력하셨습니다");
			}
			else  
				System.out.println("결과 : " + (2026 - year + 1) + "남자 입니다");
		}
		
		else {
			if (num == 2 && year > 1999) {
				System.out.println("잘못 입력하셨습니다");
				}
			else if (num == 4 && year < 2000) {
				System.out.println("잘못 입력하셨습니다");
				}
			else {
			System.out.println("결과 : " + (2026 - year + 1) + "여자 입니다");
			}
				
			}
		
		
	}

}
