package conditional;

/*
 * <switch문>
 * 선수의 순위에 따라 메달 색 정하기
 * 문자형 타입 변수
 * */
public class Ex5 {

	public static void main(String[] args) {
		char rank = '1'; // 순위

		// 변수와 값이 일치하는 case문을 실행한다
		switch (rank) {
		case '1': // rank 값이 '1'이면
			System.out.println("메달의 색은 금입니다");
			break;
		case '2': // rank 값이 '2'이면
			System.out.println("메달의 색은 은입니다");
			break;
		case '3': // if(rank=='3') 조건식과 같다
			System.out.println("메달의 색은 동입니다");
			break;
		default: // 변수와 일치하는 값이 없으면
			System.out.println("메달이 없습니다.");
		}
	}
}
