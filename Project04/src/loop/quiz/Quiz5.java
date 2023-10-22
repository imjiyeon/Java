package loop.quiz;

/*
 * continue를 사용해서,
 * 1부터 100까지의 수 중에서 3의 배수만 출력하세요.
 * */

public class Quiz5 {

	public static void main(String[] args) {

		for(int i = 1; i<=100; i++) { //i가 100될때까지 총 100번 수행함
			if (i % 3 != 0) { //i가 3의 배수가 아니면 다음 코드를 스킵
				continue;
			}
			System.out.println(i); //3,6,9...
		}
	}
}
