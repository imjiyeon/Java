package conditional.quiz;

/*
 * <switch문>
 * char타입 변수를 선언하고 문자 b,c,d 중에서 하나를 입력하세요.
 * 문자에 해당하는 동물을 출력하세요.
 * 
 * b - 새
 * c - 고양이
 * d - 강아지
 * */

public class Quiz7 {

	public static void main(String[] args) {
		char animal = 'b'; // b,c,d

		switch (animal) {
		case 'b':
			System.out.println("새");
			break;
		case 'c':
			System.out.println("고양이");
			break;
		case 'd':
			System.out.println("강아지");
			break;	
		}
	}
}
