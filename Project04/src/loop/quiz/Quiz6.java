package loop.quiz;

/*
 * 중첩반복문
 * 구구단에서 짝수는 생략하고 홀수단만 출력하세요
 * */
public class Quiz6 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 0) { // 짝수단이면 구구단 생략
				continue;
			}

			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}

//		for (int dan = 2; dan <= 9; dan++) {
//			if (dan % 2 == 1) { // 홀수단이면 구구단 출력
//				for (int times = 1; times <= 9; times++) {
//					System.out.println(dan + "X" + times + "=" + dan * times);
//				}
//				System.out.println();
//			}
//		}
	}
}
