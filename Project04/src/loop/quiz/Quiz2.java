package loop.quiz;

/*
 * 반복문을 사용해서 11부터 20까지 합을 구하고 출력하세요
 * */

public class Quiz2 {

	public static void main(String[] args) {

		int num = 11; // 11으로 초기화
		int sum = 0; // 합계

		while (num <= 20) { // num이 20이 될 때까지 총 10번 수행함
			sum = sum + num; // 11,12,13,14,15,16,17,18,19,20
			num++;
		}
		System.out.println("11부터 20까지의 합은 " + sum + "입니다.");
	}
}
