package conditional.quiz;

/*
 * 정수형 변수 i를 선언하고 숫자 값을 대입하세요.
 * 그리고 i가 100<i<200 범위에 속해있다면 "i는 100이상 200이하 입니다" 라는 메세지를 출력하세요
 * 그렇지 않다면 "i는 100보다 작거나 200보다 큽니다" 라는 메세지를 출력하세요
 * */
public class Quiz4 {

	public static void main(String[] args) {
		int i = 160;
		// && 논리곱 AND
		// || 논리합 OR
		if(i>100 && i<200) { //i가 100<i<200 범위라면, true && true -> true
			System.out.println("i는 100이상 200이하 입니다");
		}else { //그렇지 않다면
			System.out.println("i는 100보다 작거나 200보다 큽니다");
		}
	}

}
