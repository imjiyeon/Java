package loop.quiz;

/*
 * 반복문을 사용해서 10부터 20까지 츨력하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {

		int num = 10; // 10으로 초기화
		while (num <= 20) { // 조건을 만족하는 동안 블록을 10번 실행
			System.out.println(num);
			num++; // 11,12,13,14,15,16,17,18,19,20
		}
	}
}
