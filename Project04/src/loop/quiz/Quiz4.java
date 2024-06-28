package loop.quiz;


//  1부터 100까지의 수 중에서 2의 배수만 출력하세요.

public class Quiz4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) { // i가 2의 배수면 숫자를 출력하는 조건 추가
				System.out.println(i); // 2,4,6...
			}

		}
	}
}
