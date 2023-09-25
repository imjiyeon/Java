package conditional.quiz;

/*
 * 학생의 점수를 저장할 변수를 선언하고 0~99 사이의 값을 저장하세요.
 * 점수가 90~99 이면 "수"
 * 점수가 80~89 이면 "우"
 * 점수가 70~79 이면 "미"
 * 그외는 "양"을 출력하세요.
 * 
 * if문을 사용하여 코드를 작성하세요.
 * */

public class Quiz5 {

	public static void main(String[] args) {
		
		int score = 50; //학생의 점수를 저장할 변수를 선언한다

		if(score >= 90 && score<=99) { //학생의 점수가 90점 이상이면
			System.out.println("수");
		}else if(score >= 80) { //점수가 80이상이면
			System.out.println("우");
		}else if(score >= 70) { //점수가 70이상이면
			System.out.println("미");
		}else { //모두 아니라면
			System.out.println("양");
		}

	}
}
