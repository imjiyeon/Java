package conditional.quiz;

/*
 * <switch문>
 * 학생의 점수를 저장할 변수를 선언하고 0~99 사이의 값을 저장하세요.
 * 
 * 점수가 90~99 이면 "수"
 * 점수가 80~89 이면 "우"
 * 점수가 70~79 이면 "미"
 * 그외는 "양"을 출력하세요.
 * */

public class Quiz8 {

	public static void main(String[] args) {
		int score = 88;
		int value = score / 10;

		switch (value) {
		case 9: // 90~99
			System.out.println("수");
			break;
		case 8: // 80~89
			System.out.println("우");
			break;
		case 7: // 70~79
			System.out.println("미");
			break;
		default:
			System.out.println("양");
			break;
		}
		
		//조건이 90<=score<=99와 같이 포괄적인 범위일 때는 if문을 사용한다
		//switch문은 조건이 하나의 값으로 구분되는 경우에 사용한다
		//따라서 switch문을 사용하여 조건을 구현하려면 값이 구분되도록 만들어야 한다
		//점수의 범위로 몫을 구한 다음에 조건으로 사용한다
		//이와같이 조건이 복잡한 경우에는 switch문보다는 if문이 편리하다

	}
}
