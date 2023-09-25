package conditional;

/*
 * break문 없애기
 * */
public class Ex7 {

	public static void main(String[] args) {
		int time = 9;

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9: // time 값이 9이므로 해당 case를 실행한다
			System.out.println("회의를 합니다.");
			// 그런데 break를 만나지 못해서 switch문을 빠져나가지 못하고 다음 case를 연달아 실행한다
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
//		회의를 합니다.
//		업무를 봅니다.
//		외근을 나갑니다.

	}
}
