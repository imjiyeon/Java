package conditional;

/*
 * <switch문>
 * 선수의 순위에 따라 메달 색 정하기
 * 문자열 타입 변수
 * */
public class Ex6 {

	public static void main(String[] args) {
		String rank = "1"; // 순위

		switch (rank) {

		case "1": // if문으로 변경해서 적어보세요!
			System.out.println("메달의 색은 금입니다");
			break;
		case "2": //
			System.out.println("메달의 색은 은입니다");
			break;
		case "3": //
			System.out.println("메달의 색은 동입니다");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}

		/* switch문 제약조건. 
		 * switch문은 정수타입, 문자타입, 문자열타입 변수는 사용 가능하지만, 실수타입은 사용할 수 없다 
		 * */
//		float r = 1.1f;
//		switch(r) { //에러남
//			case 1.5f:
//				break;
//		}

	}
}
