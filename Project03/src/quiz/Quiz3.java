package quiz;

/*
 * 변수 num을 선언하고 456를 저장하세요.
 * 그리고 백의 자리 이하를 버린 값을 구하세요.
 * 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 됩니다.
 * */
public class Quiz3 {

	public static void main(String[] args) {

		int num = 456;
		int result = num/100 * 100;
		
		System.out.println("결과: " + result);
	}

}
