package main;

/*
 * 정수 자료형
 * */
public class Ex04 {

	public static void main(String[] args) {

		//정수형 변수는 양수 or 음수 or 0 저장 가능
		short s = 10;
		byte  b = 10;
		int i = 10;
		long l = 10;
		l = 12345678900l; //long타입에 값을 담을 때, int형 범위를 넘어가면 식별자를 붙여야함
		
		System.out.println( s + b ); //서로 다른 타입의 변수끼리 계산 가능
		
//		b = 200; //범위에 벗어나는 값을 대입하면 에러 발생
		
		//Q.변수 b에 저장할 수 값 중 가장 작은 값을 저장하세요
		b=0;
		//Q.변수 b에 저장할 수 값 중 가장 큰 값을 저장하세요
		b=0;
	}
}
