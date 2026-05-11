package Cord;

public class Cord01 {
		public static void main(String[] args) {
			int num = 15;
			int x = 3;
			
			if(num > 50) {
				System.out.println("num이 5보다 크다");
				System.out.println("if문 안 {} 실행");
				int y =20;
				y = y + 50;
				
				y = 100;
				System.out.println(y);
			}
			x = 20;
			
			int y= 5;
			if(num < 10) {
				System.out.println("num이 10보다 작구나");
				System.out.println("num이 작다");
				y=10;
			}
			else {
				System.out.println("num이 10보다 작지 않다");
			}
			
			
			boolean bool1 = (num != 15);
			
			if(bool1 == false) {
				System.out.println("num이 15랑 같은 수");
			}
			else {
				System.out.println("num이 15랑 다른 수");
			}
			
			boolean bool2 = (num == 15);
			
			if(bool2) {
				System.out.println("num이 15랑 같은 수");
			}
			else {
				System.out.println("num이 15랑 다른 수");
			}
			
			System.out.println("end");
			
		}
}
