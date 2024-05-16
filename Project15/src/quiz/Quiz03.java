package quiz;

import java.util.Scanner;


// <Scanner>
//  
// Scanner를 사용하여 문자열을 계속 입력받으세요.
// while 루프를 사용하여 입력을 계속 받고,
// 입력된 문자열이 "STOP"이면 루프를 종료하세요.
// 단, "STOP"의 대소문자는 구분할 필요가 없습니다.
// (결과 콘솔창 함께 보기)

public class Quiz03 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		// 무한 루프 만들기 
		while(true) {
			System.out.println("문자를 입력하세요:");
			String str = scanner.nextLine();

			//대소문자 상관없이 비교
			if(str.toUpperCase().equals("STOP")) {
				break; //stop이 입력됬으면 빠져나가기
			}

			//대문자로 변경한 다음에 비교
//			str.toUpperCase().equals("STOP")

			//소문자로 변경한 다음에 비교
//			str.toLowerCase().equals("stop")

		}
		
		System.out.println("프로그램이 종료되었습니다");
	}
}
