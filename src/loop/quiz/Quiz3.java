package loop.quiz;

/*
 * 1부터 100까지의 수 중에서 3의 배수만 출력하세요.
 * */

public class Quiz3 {

	public static void main(String[] args) {

		for(int i = 1; i<=100; i++) { //조건을 만족하는 동안 총 100번 반복한다. 그리고 i의 값을 변경하기 위해 1씩 증가시킨다
			if (i % 3 != 0) { //i가 3의 배수가 아닐 경우에는 코드를 스킵하도록 조건식을 추가한다
				continue;
			}
			System.out.println(i);
		}
	}
}
