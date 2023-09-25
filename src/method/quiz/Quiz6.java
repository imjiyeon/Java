package method.quiz;

/* 
 * 선수의 순위를 입력 받고 메달을 반환하는 함수를 만들고 호출한다
 * 1등 -> 금
 * 2등 -> 은
 * 3등 -> 동
 * 나머지 -> 없음
 * */
public class Quiz6 {

	//선수의 순위를 입력받고 메달을 반환하는 함수 선언
	public static String awardMedal(int rank){
		String medal = "";	
		switch (rank) {
		case 1: // rank 값이 '1'이면
			medal = "금";
			break;
		case 2:
			medal = "은";
			break;
		case 3:
			medal = "동";
			break;
		default:
			medal = "없음";
		}
		return medal;
	}
	
	public static void main(String[] args) {
		int playerLevel = 10;
		String rank = awardMedal(playerLevel);
		System.out.println(playerLevel + "등 선수의 메달은 " + rank + " 입니다");
	}

}
