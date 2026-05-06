package var;

public class Varable01 {
	public static void main(String[] args) {
		int abc;
		int def;
		
		int point;
		int score;
		
		int x, y, z ;
		
//		abc = 3;
//		def = 6;
		
//		point = abc + def;
		
		score = 90;
		
		int math = 99;
		int level;
		
		level = 50;
		
		int time;
		time = 12;
		time = 13;
		
		int myTime = 10 + 5 - 2;
		
		myTime = time + 5;
//				  13  +	5
		time = 15;
		myTime = time + 4 + time -2 + time;
		
		System.out.println(myTime);
		
		int value;
//		int result = value + 5;
//		위에건 연산불가 
//		왜 why? > value 초기화 안함(value 값이 안정해졌음)
		value = 20;
		int result = value + 5;
		
		System.out.println(1293858);
		System.out.println("문자출력");
		System.out.println(value);
		System.out.println(result);
		
		System.out.println(result + 50);
		System.out.println(result * 2 + value * result);
		
		int totalScore = score + score + 50;
		System.out.println(totalScore);
		
		System.out.println(totalScore + 30);
		
		System.out.println(totalScore);
		totalScore = totalScore + 70;
		System.out.println(totalScore);
		
		int a = 10;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		
//		값 바꾸기 n개면 n +1 개 변수필요
//		왜 why? > 그냥 냅다 바꾸면 덮어써버려서 값하나가 날라감
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		
//		아니 그럼 무조건 n + 1 개여야해?
//		ㄴㄴ 산술/비트 연산자 사용하면 ㄱㄴ
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
//		산술 연산
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println(a);
		System.out.println(b);
//		비트 연산
	}
}
