package quiz;
import java.util.Scanner;

public class quiz0514P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 1\n");
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("몇번째 수 인가요?");
		int num = sc.nextInt();
		
		System.out.println("결과 : " + arr[num-1]);
		
		
		
		System.out.println("\n문제 2\n");
		int[] arr1 = new int[5];
	
		for (int i = 0; i < 5 ; i++) {
		arr1[i] = sc.nextInt();
		}
		System.out.print("결과 : ");
		
		for (int i =4 ; i >=0; i--) {
			System.out.print(arr1[i] + " ");
		}
		
		
		
		System.out.println("\n문제 3\n");
		int[][] arr2 = new int[4][4];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j<arr2.length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// 배열 크기에 맞게 for 문 슬때는 아래와 같이 .length 쓸것
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j< arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	
	
	
	
	}

}
