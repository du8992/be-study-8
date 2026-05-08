package quiz;

public class quiz0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 10;
		int q = 4;
		double e = (double) w/q;
		System.out.println(e);
		
		
		
		int x = 10;
		int y = 4;
		double result = x/y;
		System.out.println(result);
		
	
		
		double a = 3.5;
		double b = 4.7;
		double And = a + (int)b;
		System.out.println(And);
		
		String a1 = "3.4";
		String b1 = "4";
		int result1 = (int)Double.parseDouble(a1) * Integer.parseInt(b1);
		System.out.println(result1);
		
		String a2 = "10";
		int b2 = 3;
		double c = 4.5;
		String result12 = a2 + (int)(b2 * c);
		System.out.println(result12);
		
		int a3 = 4;
		double b3 = 3.4;
		String c3 = "6.8";
		
		String result123 = "" + (a3 * (int)Double.parseDouble(c3)) + String.valueOf( (int)b3);
		System.out.println(result123);
		
		int x1 = 111;
		int y1 = 13;
		int result23 = x1 % y1;
		System.out.println(result23);
		
		int x2 = 111;
		int y2 = 13;
		int result234 = x2 / y2;
		System.out.println(result234);
	}

}
