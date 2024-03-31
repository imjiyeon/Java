package loop.quiz;

// *****
// *****
// *****
// 중첩반복문을 사용해서 직사각형을 그려보세요
public class Quiz9 {

	public static void main(String[] args) {

		// 반복문 없이 작성
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");

		// 반복문을 사용하여 작성 (1)
		for (int i = 1; i <= 3; i++) {
			System.out.println("*****");
		}

		// 반복문을 사용하여 작성 (2)
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// 외부포문-사각형의 높이
		// 내부포문-사각형의 길이

	}
}

