package main;

import java.io.IOException;
import java.util.Scanner;

/*
 * 산술연산
 * Q. 변수 x에 정수를 입력 받고, x + 5 를 연산해 변수 y에 저장한다.
 * */
public class Ex2 {

	public static void main(String[] args) throws IOException {
		int x; //x는 정수를 저장하기 위한 변수이다
		int y; //y는 결과를 저장하기 위한 변수이다

		Scanner scanner = new Scanner(System.in); 
		
		x = scanner.nextInt(); //정수를 입력받아 x에 저장한다
		y = x + 5; //y에 x+5를 연산한 결과를 저장한다
		System.out.println(y); //y를 출력한다
	}

}
