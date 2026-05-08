package oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( 1 + 1 );
		System.out.println( 10 - 5 );
		System.out.println( 5 * 9 );
		System.out.println( 30 / 7 );
		System.out.println( (double)30 / 7 );
		System.out.println( 30 / 7.0 );
		System.out.println( 9 % 5 );
		System.out.println( 28 % 9 );
		
		System.out.println( 10 );
		System.out.println( +10 );
		System.out.println( -10 );
		System.out.println( -(-10) );
		
		System.out.println("===========증감===========");
		
		int x = 10;
		System.out.println( x );
		System.out.println( ++x );
		System.out.println( x );
		
		System.out.println( 1 + x );
		System.out.println( x );
		
		System.out.println( x++ );
		System.out.println( x );
		
		int q =1;
		int w=3;
		int e = 10 + ++q;
		int r =3 + w--;
		
		System.out.printf("%d %d %d %d \n", q, w, e, r);
		
		
		System.out.println( "========논리========" );
		boolean isHungry = true;
		System.out.println( isHungry );
		System.out.println( !isHungry );
		System.out.println( isHungry );
		System.out.println( true );
		System.out.println( false );
		System.out.println( !true );
		System.out.println( !false );
		
		isHungry = false;
		isHungry = !isHungry;
		
		System.out.println( 133 + 3.345 + "문자" );
		
		System.out.println( "========비교========" );
		System.out.println( 1 == 2 );
		System.out.println( 1 != 2 );
		System.out.println( 1 < 2 );
		System.out.println( 10 >= 9 );
		System.out.println( 2 > 2 );
		System.out.println( 9 <= 1 );
		System.out.println( 1 == 2 );
		
		boolean b1 = (9 > 8);
		
		System.out.println( 1 == 2 );
		
		System.out.println( "========논리========" );
		
		boolean b2 = (10 > 6) && (10 > 5);
		
		System.out.println( b2 );
		
		boolean b3 = (5 != 1) || (10 < 4);
		
		System.out.println( b3 );
		
		boolean b4 = (3 >= 1) && !(3 < 4);
		
		System.out.println( b4 );
		
		int a = 30;
		a = 50;
		
		a += 30;	// a = a + 30;
		a -= 30;	// a = a - 10;
		a *= 3;		// a = a * 3;
		a /= 2;		// a = a / 2;
		a %= 4;		// a = a % 4;
		
		System.out.println( "========삼항 연산자========" );
		
		//조건식 ? 참일때  거짓일때	
		int point = 300;
		String eventItem = (point > 200) ? "커피" : "생수" ;
		
		System.out.println( eventItem );
		
		eventItem = point <= 200 ? "생수" : "커피" ;
		System.out.println( eventItem );
		System.out.println( point > 50 ? "단골" : "신규" );
		
		//삼항 연산자 중첨 ㄱㄴ
		//point > 50 ?  ((point > 50) ? "단골" : "신규") : "신규" 
		point = 150;
		System.out.println (point <= 200 ? "생수" : (point > 300 ? "맥주" : "커피"));
		point = 220;
		System.out.println (point <= 200 ? "생수" : (point > 300 ? "맥주" : "커피"));
		point = 550;
		System.out.println (point <= 200 ? "생수" : (point > 300 ? "맥주" : "커피"));
		
		int num = 10;
		
		System.out.println( num < 0 ? ".음수" : "양수");
		
		System.out.println( num == 0 ? "0" : ( num > 0 ? "양수" : "음수")) ;
		System.out.println( num != 0 ? ( num < 0 ? "음수" : "양수") : "0" );
		System.out.println( num > 0 ? "양수" : ( num < 0 ? "음수" : "0"));
		System.out.println( num >= 0 ?  ( num == 0 ? "0" : "양수") : "음수");
		
	}

}
