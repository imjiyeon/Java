package conditional;

/*
 * <if~elseif~else문>
 * 나이에 따라 다른 문장 출력하기
 * */
public class Ex3 {

	public static void main(String[] args) {

		int age = 30;
		
		if (age < 8) { // 나이가 8살 미만이면
			System.out.println("미 취학 아동입니다.");
		} else if (age < 14) { // 나이가 14살 미만이라면
			System.out.println("초등학생 입니다.");
		} else if (age < 20) { // 나이가 20살 미만이라면
			System.out.println("중, 고등학생 입니다.");
		} else { // 모두 아니라면
			System.out.println("성인 입니다.");
		} 
		//어떤 조건을 만족하면, 다음 조건을 비교하지않고 조건문이 종료된다 
	}
}
