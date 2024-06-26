package conditional.quiz;

import java.io.IOException;


//  <if~else문>
//  문자형 변수 gender를 선언하고, 문자 하나를 대입하세요.
//  변수의 값이 F면 "여성입니다", 그렇지 않으면 "남성입니다"를 출력하세요.

public class Quiz3 {

	public static void main(String[] args) {
		char gender = 'F';

		if (gender == 'F') { // gender가 F라면
			System.out.println("여성입니다");
		} else { // 그렇지 않다면
			System.out.println("남성입니다");
		}
	}
}
