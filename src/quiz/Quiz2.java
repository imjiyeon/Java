package quiz;

import java.util.Scanner;

/*
 * <조건문>
 * Scanner 클래스를 사용하여 두 숫자를 입력 받는다
 * 첫번째 숫자가 두번째 숫자로 나누어 떨어지는지 확인한다
 * 결과에 따라 "나누어 떨어진다" 또는 "나누어떨어지지않는다"를 출력한다
 * */
public class Quiz2 {

	public static void main(String[] args) {
		int x; //x는 정수를 저장하기 위한 변수이다
		int y; //y는 결과를 저장하기 위한 변수이다
		
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt(); //정수를 입력받아 x에 저장한다
		y = scanner.nextInt(); //정수를 입력받아 y에 저장한다
		
		if(x%y == 0) { //x를 y로 나눈 후, 나머지가 0과 같은지 비교한다
			System.out.println("나누어떨어진다"); //참이면 나누어떨어진다 메세지를 출력한다
		}else {
			System.out.println("나누어떨어지지않는다"); //거짓이면  나누어떨어지지않는다 메세지를 출력한다
		}
		
	}

}
