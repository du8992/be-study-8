package refer;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 =100;
		int score2 =50;
		int score3 =75;
		int score4 =80;
		int score5 =40;
		
		int sum = 0;
		sum = score1+ score2 + score3 + score4 + score5;
		
		double avg = sum / 5.0;
		
		System.out.println("총점 : " + sum + "평균 : " + avg);
		
		
		sum = sum + score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		sum = sum + score5;
		
		int [] scoreArr = {100, 50, 75 ,80, 40};
		
		sum = 0;
		sum = scoreArr[0] + scoreArr[1] + scoreArr[2] + scoreArr[3] + scoreArr[4];
		avg = sum / 5.0;
		System.out.println("종점 : " + sum + "평균 : " + avg);
		
		sum = sum + scoreArr[0];
		sum = sum + scoreArr[1];
		sum = sum + scoreArr[2];
		sum = sum + scoreArr[3];
		sum = sum + scoreArr[4];
		
		sum = 0;
		for(int i = 0; i<5; i++) {
			sum = sum + scoreArr[i];
			
		}
		avg = sum / 5.0;
		System.out.println("종점 : " + sum + "평균 : " + avg);
		int n;
		int[] menuArr;
		
		
		int n2 = 0;
		int[] pointArr = null;
		
		pointArr = new int[] {30, 20, 10, 5, 1}; //여관 방에 들어갈 투숙객
		pointArr = new int[5]; //여관 크기 지정하는거 방이 5개라는거임
		
		n = 30;
		n = n + 5;
		
		pointArr[2] = 10;  //2벙방에 10저장하겠다는뜻
//		pointArr = 10;     //이렇게는 못슴 > 왜 why 저건 방여러개있는 여관임 여관이 10 이라고 저장할거임?
		
		pointArr[0] = 30;
		pointArr[1] = 20;
		pointArr[2] = 10;
		pointArr[3] = 5;
		pointArr[4] = 1;
		
		for(int i = 0; i < 5; i++) {
			pointArr[i] = i+1;
		}
		
		/*for(int i = 0; i < 5; i++) {
			pointArr[i] = i;
			
				}
		*/
		for(int i = 0; i < 5; i++) {
			System.out.print(pointArr[i] + "");
				}
		System.out.println();
		
		
		int [] intArr = new int [6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[14];
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + "");
				}
		System.out.println();
	
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i] + "");
				}
		System.out.println();
		
		for(int i = 0; i < stringArr.length; i++) {
			System.out.print(stringArr[i] + "");
				}
		System.out.println();
		
		for(int i = 0; i < booleanArr.length; i++) {
			System.out.print(booleanArr[i] + "");
				}
		System.out.println();
		
	}
	
	

}
