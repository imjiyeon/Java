package loop.quiz;

// 중첩 반복문을 사용해서 직각삼각형을 그려보세요
// *
// **
// ***
// ****
// *****

public class Quiz10 {

	public static void main(String[] args) {

		// 반복문 없이 작성
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("***");
		System.out.println("*****");

		// 반복문을 사용하여 작성(1)
		for (int i = 1; i <= 5; i++) { //삼각형의 높이

			// 삼각형의 길이
			System.out.print("??"); // *의 개수는 높이와 같음
		}

		// 반복문을 사용하여 작성(2)
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) { // 외부포문의 i를 사용함
				System.out.print("*");
			}

			System.out.println();
		}

	}
}

//<문제풀이>
//도형의 패턴을 찾아서 반복문과 조건문으로 표현
//1번째 줄: 별1개
//2번째 줄: 별2개
//3번째 줄: 별3개
//4번째 줄: 별4개
//5번째 줄: 별5개