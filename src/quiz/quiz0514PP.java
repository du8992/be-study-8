package quiz;
import java.util.Scanner;

public class quiz0514PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 1\n");
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"입력", "수정", "조회", "삭제", "종료"};
		
		 while (true) {

	            
	            for (int i = 1; i <= 5; i++) {
	                System.out.println(i + ". " + arr[i - 1]);
	            }

	            System.out.print("메뉴 번호를 입력하세요 : ");
	            int a = sc.nextInt();

	            
	            if (a < 1 || a > 5) {
	                System.out.println("잘못 입력하셨습니다.\n");
	                continue;
	            }

	            
	            if (a == 5) {
	                System.out.println("종료합니다.");
	                break;
	            }

	            
	            System.out.println(arr[a - 1] + " 메뉴 입니다.\n");
	        }
		
	}

}
