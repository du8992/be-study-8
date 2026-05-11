package Cord;

public class Cord04 {
	public static void main(String[] args) {
		int goBedTime = 23;
		int sleepTime = 5;
		
		if( goBedTime <= 21) {
			
			if(sleepTime >= 8) {
				System.out.println("일찍 많이");
			}
			else {
				System.out.println("일찍 적게");
			}
		}
		else {
			if(sleepTime >= 8) {
				System.out.println("늦게 많이");
			}
			else {
				System.out.println("늦게 적게");
			}
		}
		
		if( goBedTime <= 21 && sleepTime >= 8) {
			System.out.println("일찍 많이");
		}
		else if( goBedTime <= 21 && sleepTime < 8) {
			System.out.println("일찍 적게");
		}
		else if( goBedTime > 21 && sleepTime >= 8) {
			System.out.println("일찍 적게");
		}
		else {
			System.out.println("늦게 적게");
		}
		
		int point = 50;
		
		if(point >= 0 && point <= 100) {
			
			if (point >= 50) {
				System.out.println("nice!");
			}
			else {
				System.out.println("NT");
			}
		}
	}
}
