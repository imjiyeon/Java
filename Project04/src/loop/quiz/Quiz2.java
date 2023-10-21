package loop.quiz;

/*
 * 반복문을 사용해서 20부터 100까지 합을 구하고 출력하세요
 * */

public class Quiz2 {

	public static void main(String[] args) {

		int num = 10; // 10으로 초기화
		int sum = 0; // 합계를 저장할 변수

		while (num <= 20) { // 조건을 만족하는 동안 총 10번 실행
			sum = sum + num;
			num++; // 11,12,13,14,15,16,17,18,19,20
		}
		System.out.println("10부터 20까지의 합은 " + sum + "입니다.");
	}
}
