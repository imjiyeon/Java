package loop;

/*
 * for문을 사용해 1부터 20까지 값을 더하다가
 * 합이 100이 넘어가면 반복문을 중단한다
 * for문이 종료되기전 i과 sum의 값을 출력한다
 * */
public class Ex8 {

	public static void main(String[] args) {
		int sum = 0; // 합계
		int i; // 마지막에 i의값을 출력하기 위해 외부에 선언
		
		for (i = 1; i <= 20; i++) { // i가 1부터 20이 될때까지 총 20번 수행함
			sum = sum + i;
			System.out.println("i: " + i + " , sum: " + sum);
			if (sum >= 100) { // 합이 100을 넘으면 for문 종료
				break;
			}
		}
		
		System.out.println("i : " + i); // 14
		System.out.println("sum : " + sum); // 1~14까지의 합은 105
	}

}
