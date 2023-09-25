package ex;

import java.util.Scanner;

/*
 * 연습문제 풀기 전에 Scanner 클래스 테스트하기
 * */

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		int num =  scanner.nextInt(); //숫자를 입력받음
		System.out.println(num);
		
	}
}

