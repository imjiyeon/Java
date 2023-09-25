package hiding.quiz;

/*
 * Ex2 클래스를 복사한다
 * setMonth 메소드에 다음과 같이 조건을 추가한다
 * 1~12월이 들어오면 값을 변경하고, 그외의 값이 들어오면 "잘못된 월입니다" 메세지를 출력한다
 * */
public class Quiz1 {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(2);
		System.out.println(date.toString());

		date.setMonth(13); // 존재하지않는 월입니다
		System.out.println(date.toString());
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
			System.out.println(month + "월은 존재하지 않습니다");
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

	@Override
	public String toString() {
		return "MyDate [month=" + month + ", day=" + day + "]";
	}
}
