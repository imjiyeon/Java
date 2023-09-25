package main;

/*
 * 정수형 연습
 * */
public class Ex04 {

	public static void main(String[] args) {

		//정수형에는 4가지 종류가 있고, 양수/음수/0 값을 저장 할 수 있다
		short s = 10;
		byte  b = 10;
		int i = 10;
		long l = 10; //식별자 생략가능
		l = 12345678900l; //int형 범위를 넘어갈 때는 반드시 식별자를 명시해야한다
		
		System.out.println( s + b ); //서로 다른 자료형으로 더하기 연산을 할 수 있다
		
//		b = 200; //범위에 벗어나는 값을 대입하면 에러가 발생한다
		
		//Q.변수 b에 저장할 수 값 중 가장 작은 값을 저장하세요
		b=0;
		//Q.변수 b에 저장할 수 값 중 가장 큰 값을 저장하세요
		b=0;
	}
}
