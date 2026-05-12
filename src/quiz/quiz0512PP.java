package quiz;

public class quiz0512PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0 ;
		int j = 0;
		
		
		System.out.println("문제 1 (방법 1)");
		for(i =1 ; i < 6; i++) {
			
			System.out.println("12345");
			
		}
		
		
		
		System.out.println("\n문제 1 (방법 2)");
		
		for (i = 0; i < 5; i++) {     
			
		    for (j = 1; j <= 5; j++) {  
		    	
		        System.out.print(j);
		        
		    }
		    
		    System.out.println();           
		}
		
		
		
		System.out.println("\n문제 2(방법 1)");
		
		for(i =1 ; i < 6; i++) {
			
			System.out.println("" + i +i +i +i +i);
			
		}
		
		
		
		System.out.println("\n문제 2(방법 2)");
		for (i = 1; i <= 5; i++) {    
			
		    for (j = 0; j < 5; j++) {    
		        System.out.print(i);
		    }
		    
		    System.out.println();           
		}
	}

}
