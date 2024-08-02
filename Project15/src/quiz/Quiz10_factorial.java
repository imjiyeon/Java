package quiz;

public class Quiz10_factorial {

	public static void main(String[] args) {
		
		int result = factorial(3); //3!
		System.out.println(result);
	}

	// 3!
	// 3 * 2!
	// 2 * 1!
	// return 1
	
	public static int factorial(int num) {		

		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}

	}
	// 먼저 실행된 함수가 나중에 끝남..
	// 호출 순서
	// main()
	// factorial(3); //3!
	// 3 * factorial(2); 3 * 2!
	// factorial(1); // 2 * 1
	
	// 완료 순서
	// factorial(1);
	// 3 * factorial(2);
	// factorial(3);
	// main()

}
