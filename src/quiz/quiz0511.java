package quiz;
import java.util.Scanner;

public class quiz0511 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요: ");
        int num = sc.nextInt(); // 3. 정수 입력
        
        if (num < 1 || num > 24) {
        	System.out.println("잘못입력했습니다");
        }
        else if (num <= 12) {
        	System.out.println("오전입니다");
        	if (num <= 6) {
        		System.out.println("이른 오전입니다");
        	}
        	
        	else {
        		System.out.println("늦은 오전입니다");
        	}
        }
        else  {
        	System.out.println("오후입니다");
        	if (num <= 18) {
        		System.out.println("이른 오후입니다");
        	}
        	
        	else {
        		System.out.println("늦은 오후입니다");
        	}
        }
        
        int diceNum = 3;
        if(diceNum == 1) {
			System.out.println("1");
		}
		else if(diceNum == 2) {
			System.out.println("2");
		}
		else if(diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			
		}
		else if(diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		}
		else if(diceNum == 5) {
			System.out.println("5");
		}
		else {
			System.out.println("6");
		}
        
        String localNum = "031";
        
        switch (localNum) {
        case "031": 
        	System.out.println("경기도입니다");
        	break;
        
        case "02": 
        	System.out.println("서울입니다");
        	break;
        	
        case "041": 
        	System.out.println("충남입니다");
        	break;
        
        
        case "051": 
     	System.out.println("부산입니다");
     	break;
     	
        }
        
        System.out.print("점수를 입력하세요: ");
        int score1 = sc.nextInt();
        int score = 0;
        score = score1 / 10;
        
        
        switch (score) {

        case 10 :
        	System.out.println("학점 A");
        	break;
        case 9 :
        	System.out.println("학점 A");
        	break;
        	
        case 8 :
        	System.out.println("학점 B");
        	break;
        
        case 7 :
        	System.out.println("학점 C");
        	break;
        
        default :
        	System.out.println("학점 F");
        	break;
        	
        }
        
	}

}
