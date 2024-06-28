package loop.quiz;


//  for문을 사용해 1부터 100까지 더하는 코드를 작성하세요.
//  단 중간에, 합이 500이 넘어가면 중단합니다.
//  for문이 종료되기전 num과 sum의 값을 출력하세요.

public class Quiz6 {

	public static void main(String[] args) {
		int sum = 0; // 합계
		int i; // 더할 수

		for (i = 1; i <= 100; i++) { // i가 100이 될때까지 총 100번 수행함
			sum = sum + i; // i를 1씩 증가시키면서 sum에 더하기
			if (sum >= 500) { // sum이 500을 넘으면 for문을 종료
				break;
			}
		}
		System.out.println("i: " + i + " , sum: " + sum); // i: 32 , sum: 528
	}

}