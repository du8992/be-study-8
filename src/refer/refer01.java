package refer;
import java.util.Scanner;

public class refer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int num = 0;
		
		String s1;
		String s2 = null;
		
		System.out.println(num);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		
		
		String t1 = "사과";
		String t2 = "사과";
		String t3 = scanner.nextLine();
		String t4 = new String("사과");
		
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		
		System.out.println(t1 == t3);
		System.out.println(t1.equals(t3));
		
		System.out.println(t1 == t4);
		System.out.println(t1.equals(t4));
		
		String ne = null;
		System.out.println(ne == null);
		
		
		int n1= 10;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		
		String str1 = "커피";
		String str2 = str1;
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
