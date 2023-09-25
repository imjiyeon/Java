package main;

/*
 * 변수 선언하여 사용하기
 * 테스트~~~~
 * */
public class Ex01 {
		public static void main(String[] args) {
			int x;              //정수형 변수 x을 선언
			x = 10;             //x 변수에 10을 대입
			
			//print함수는 콘솔창에 문자를 출력하는 함수이다. 함수에대한 자세한 내용은 뒷장에서 배울 예정. 
			System.out.println(x); //x를 출력하면 변수에 담긴 값이 출력됨
			
			System.out.println("안녕하세요"); //줄바꿈
			System.out.print("반갑습니다"); //줄바꿈 없음
			System.out.print("반갑습니다");

			//sysout -> 컨트롤 + 스페이스 -> 코드 자동완성
		}
}
