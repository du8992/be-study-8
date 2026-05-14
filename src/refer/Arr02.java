package refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int[] arr1 = new int [5];
		
		int [][] arr2 = new int [3][5];
		
		int[][] arr3 = new int[4][3];
		
		int[] arr11 = {1,2,3,4,5,6};
		
		int [][] arr22 = { {1,2,3}, {4,5,6} };
		
		int[][] arr33 = { {1,2}, {3,4}, {5,6} };
		
		System.out.println(arr22[0][2]);
		System.out.println(arr33[2][1]);
		
		int[][] arr4 = new int [2][3];
		
		for (int i = 0 ; i< 2; i++) {
			for(int j =0; j < 3; j++) {
				System.out.print( arr4[i][j] + "");
			}
			System.out.println();
		}
		
		for(int i = 0; i<arr4.length; i++) {
			for(int j= 0; j < arr4[i].length ; j++) {
				System.out.print( arr4[i][j] + "");
			}
			System.out.println();
		}
	}
	
	

}
