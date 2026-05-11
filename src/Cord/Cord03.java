package Cord;

public class Cord03 {
	public static void main(String[] args) {
		int dice = 5;
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		}
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		}
		else {
			System.out.println("두칸 전진");
		}
		
		
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		}
		else if(dice == 2) {
			System.out.println("두칸 전진");
		}
		else if(dice == 3) {
			System.out.println("세칸 전진");
		}
		else if(dice == 4) {
			System.out.println("네칸 전진");
		}
		else if(dice == 5) {
			System.out.println("다섯칸 전진");
		}
		else {
			System.out.println("여섯칸 전진");
		}
		
		//위 에는 하나만 맞으면 될때 아래는 하나하나 다 확인해야 할때
		
		if(dice > 10) {
			
		}
			
		if(dice > 0 && dice <= 6) {
			
		}
			
		if(dice < 1 || dice > 6) {
			
		}
						
		if(dice == 1) {
			
		}
						
		if(dice == 1) {
			
		}
		
		
		dice = 6;
		
		switch ( dice ) {
		case 1:
			System.out.println("case 1");
			System.out.println("case 1");
			System.out.println("case 1");
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
		case 5:
			System.out.println("case 5");
			break;
		default:
			System.out.println("case 6");
			break;
		
		}
		
		
		int showTime = 8;
		
		if ( showTime <= 8 ) {
			//청소
			//회의
			//업무
			//외근
		}
		else if ( showTime <= 9 ) {
			//회의
			//업무
			//외근
		}
		else if ( showTime <=10 ) {
			//업무
			//외근
		}
		else if ( showTime <=11 ) {
			//외근
		}
		
		switch (showTime) {
		case 8:
			//청소
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
		default:
		}
	
		switch (showTime) {
		case 8:
			//청소
			//회의
			//업무
			//외근
			break;
		case 9:
			//회의
			//업무
			//외근
			break;
		case 10:
			//업무
			//외근
			break;
		case 11:
			//외근
			break;
		}
	
	}
}
