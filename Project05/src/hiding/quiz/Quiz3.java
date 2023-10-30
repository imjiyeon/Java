package hiding.quiz;

/*
 * Mydate 클래스의 setMonth 메소드에 다음과 같이 조건을 추가하세요.
 * 1~12월이 들어오면 값을 변경하고, 
 * 그외의 값이 들어오면 "잘못된 월입니다" 메세지를 출력합니다.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(2);
		System.out.println("현재는 " + date.getMonth() + "월 입니다");

		date.setMonth(13);
		System.out.println("현재는 " + date.getMonth() + "월 입니다");
	}
}

class MyDate {

	private int month; // 월
	private int day; // 일

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println(month + "월은 잘못된 월입니다.");
			return; //함수종료
		} 
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("2월에는 " + day + " 일이 없습니다!!");
				return;
			}
		}
	}

}
