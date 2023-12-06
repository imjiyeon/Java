package object;

/*
 * 1. 연도,월,일을 멤버로 가지는 Date클래스를 만드세요.
 * 2. 다음과 같이 인스턴스를 2개 생성하세요.
 * MyDate date1 = new MyDate(2022,10,26);
 * MyDate date2 = new MyDate(2022,10,26);
 * 3. 날짜의 내용을 같은지 비교하도록 equals 메소드를 재정의하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2022,10,26);
		MyDate date2 = new MyDate(2022,10,26);

		if (date1.equals(date2)) {
			System.out.println("date1와 date2는 같은 날짜입니다.");
		} else {
			System.out.println("date1와 date2는 같은 날짜가 아닙니다.");
		}
	}
}

class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			
			return (this.day == date.day && this.month == date.month && this.year == date.year);
		}

		return false;
	}

}
