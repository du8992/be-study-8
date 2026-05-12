package lter;

public class lter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("for 문 반복");
		}
		System.out.println("end\n");
		
		int i =1;
		while (i <= 5 ) {
			System.out.println("while 문 반복");
			i++;
		}
		System.out.println("end \n");
	
		i = 10;
		while(true) {
			i++;
			System.out.println("while(true) : " + i);
			
			
			if(i==20) {
				break;
			}
			System.out.println("while(true) : " + i);
		}
		
	
		
		i=30;
		do {
			System.out.println("조건상관없이 실행");
		}while(i<10);
		while (i < 10) {
			System.out.println("그냥 while");
		}
		
		System.out.println("end \n");
		
		for (i=1;i<=10;i++) {
			System.out.println(i);
			if(i==8) {
				break;
			}
		}
		System.out.println("end \n");
		
		i=1;
		while(i<=10) {
			System.out.println(i);
			if(i==8)
				break;
			i++;
		}
		System.out.println("end \n");
		/*
		i=0;
		while(i<=10) {
			i++;
			if(i==5) {
				
			}
		}
		*/
	
	}
	
	

}
