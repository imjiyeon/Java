package main;

import java.util.Scanner;

/*
 * 함수
 * Q. 두 수를 입력 받고 합을 출력하는 함수를 정의하고 호출한다.
 * */
public class Ex5 {

	public static void add(int n1, int n2) { //함수 정의
		int sum; //sum은 결과를 저장하기 위한 변수이다
		
		sum = n1 + n2; //sum에 두 수를 더한 결과를 저장한다
		
		System.out.println(sum); //sum을 출력한다
	}
	
	public static void main(String[] args) {
		int num1; //num1,num2는 정수를 저장하기 위한 변수이다
		int num2;
		
		Scanner scanner = new Scanner(System.in); 
		num1 = scanner.nextInt(); //정수를 입력받아 num1에 저장한다
		num2 = scanner.nextInt(); //정수를 입력받아 num2에 저장한다
		
		add(num1, num2); //num1, num2를 매개변수로 전달하여 add함수를 호출한다
	}

}
