package loop;

/*
 * while을 사용해서 숫자 1~10까지 출력하기
 * */
public class Ex2 {

	public static void main(String[] args) {

		int num = 1; //출력할 숫자

		while (num <= 10) { // 조건을 만족하는 동안 블록을 10번 실행한다
			System.out.println(num);
			num++; // num을 1씩 증가시켜서 출력한다
		}
	}
}
