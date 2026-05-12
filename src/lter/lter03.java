package lter;

public class lter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=1; i<=5; i++) {
		System.out.println("for i 실행문" + i);
		for(int j=1; j<=3; j++) {
			System.out.println("내부 for j 실행문" + j);
			
		}
		System.out.println("for i 실행문 한사이클 종료" + i);
	}
	
	System.out.println("end \n");
	
	for(int i=1; i<=5; i++) {
		
		for(int j=1; j<=3; j++) {
			
			for(int k=1; k<=2; k++) {
				
				
			}
		}
	}
	System.out.println("end \n");
	
	
	
	for(int i=1; i<=3; i++) {
		System.out.println("쓸기");
		for(int j=1; j<=2; j++) {
			System.out.println("닦기");
			for(int k=1; k<=1; k++) {
				System.out.println("정리");
				
			}
		}
	}
	
	}

}
