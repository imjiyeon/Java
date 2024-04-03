package hiding;

/*
 * private 변수과 public 메소드
 * */
public class Ex2 {
	public static void main(String[] args) {

		MyDate2 date = new MyDate2(); // 날짜 생성

		date.setMonth(2);

		//private 변수는 외부에서 직접 사용할 수 없음
		// date.day = 30;

		date.setDay(30); // 검증 실패하여 저장 실패
		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일 입니다");

		date.setDay(10); // 저장 성공
		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일 입니다");
	}
}

// 이름이 중복되니까 "2"를 붙여주세요!
class MyDate2 {
	// private 멤버변수
	private int month; // 월
	private int day; // 일

	// public 메소드
	// 월을 가져오는 메소드
	public int getMonth() {
		return month;
	}

	// 월을 변경하는 메소드
	public void setMonth(int month) {
		this.month = month;
	}

	// 일을 가져오는 메소드
	public int getDay() {
		return day;
	}

	// 일을 변경하는 메소드
	// 새로들어온 값이 올바른 일자인지 확인하고 저장
	public void setDay(int day) {
		// month가 2월 인 경우, 1~28일에 포함되면 저장
		if (month == 2) { // 1,3,4,...
			if (day < 1 || day > 28) { // 아니라면 값을 저장안함
				System.out.println("2월에는 " + day + " 일이 없습니다!!");
				return;
			}
		}

		this.day = day;
	}

}
