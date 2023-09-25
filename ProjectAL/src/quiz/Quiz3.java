package quiz;

import java.util.Scanner;

/*
 * <조건문>
 * Scanner 클래스를 사용하여 숫자 3개를 입력 받는다
 * 그리고 세 개의 숫자 중에서 제일 큰 값을 구한다
 * */
public class Quiz3 {

	public static void main(String[] args) {
		
		int a; //a는 정수를 저장하기 위한 변수이다
		int b;
		int c;
		int max; //max는 제일 큰 값을 저장하기 위한 변수이다
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt(); //정수를 입력받아 a에 저장한다
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		// a b c 중에서 제일 큰값을 구하려면 abc를 한번씩 비교해야한다
		// a > b --> 큰값 > c
		max = a; //max에 a값을 초기화한다
		if(b > max) { //b가 현재 max보다 더 큰지 비교한다
			max = b; //참이면 max에 b값을 저장한다
		}
		if(c > max) { //c가 현재 max보다 더 큰지 비교한다
			max = c; //참이면 max에 c값을 저장한다
		}
		
		System.out.println("제일 큰값은 " + max + "입니다");
	}

}
