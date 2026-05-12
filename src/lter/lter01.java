package lter;

public class lter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("배고파");
		for(int i=1; i<=10; i++) {
			System.out.println("hungry");
		}
		System.out.println("end");
		
		int i = 0;
		for(i= 1; i < 3; i++) {
			System.out.println("졸려");
		}
		System.out.println("end");
		
		
		
		for(i = 35; i < 45; ++i ) { 
			System.out.println("이제 그만..");
		}
		System.out.println("end");
		
		System.out.println(i);
		
		
		
		
		for (i=10; i<15; i++) {
			System.out.println("다이어트 1일차");
			System.out.println("다이어트 2일차");
			System.out.println("다이어트 3일차");
			System.out.println("다이어트 4일차");
			System.out.println("다이어트 5일차");
		}
		System.out.println("end");
		
		
		
		
		for (i =1; i <6 ; i++) {
			System.out.println("다이어트" + i + "일차");
		}
		System.out.println("end");
		
		
		
		int z = 0;
		for (i =1 ; i < 6; i++) {
			z = z + i;
		}
		System.out.println("총 누적 합 : " + z);
		
		
		
		z = 0;
		for (i = 1; i < 11; i++) {
			z= z + (i * 10);
		}
		System.out.println("(10의 배수 100까지)총 누적 합 : " + z);
		
		
		
		z = 0;
		for (i = 10; i < 101; i=i+10) {
			z= z + i;
		}
		System.out.println("(10의 배수 100까지)총 누적 합 : " + z);
		
		
		
	}
	

}
