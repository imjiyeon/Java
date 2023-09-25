package conditional.quiz;

/*
 * switch문을 이용해서 승객의 연령에 따라 버스 요금을 출력하세요
 * String타입 변수를 선언하고 승객의 연령을 입력하고, 조건으로 사용하세요
 * 미성년자 - 1000원
 * 성인 - 1500원
 * 노인 - 무료
 * */
public class Quiz6 {

	public static void main(String[] args) {
		String age = "성인"; // 미성년자, 성인, 노인

		switch (age) {
		case "미성년자":
			System.out.println("요금은 1000원입니다");
			break;
		case "성인":
			System.out.println("요금은 1500원입니다");
			break;
		case "노인":
			System.out.println("요금은 무료입니다");
			break;	
		}
	}
}
