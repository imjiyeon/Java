package object;

//  연도,월,일을 멤버로 가지는 Date클래스를 만드세요.
//
//  날짜의 내용을 같은지 비교하도록 equals 메소드를 재정의하세요.
//
//다음과 같이 인스턴스를 생성하고, 비교하세요
//MyDate date1 = new MyDate(2024, 4, 16);
//MyDate date2 = new MyDate(2024, 4, 16);
//date1.equals(date2) --> true
//
//MyDate date3 = new MyDate(2024, 4, 16);
//MyDate date4 = new MyDate(2024, 4, 17);
//date3.equals(date4) --> false

public class Quiz1 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2024,4,16);
		MyDate date2 = new MyDate(2024,4,16);

		if (date1.equals(date2)) {
			System.out.println("date1와 date2는 같은 날짜입니다.");
		} else {
			System.out.println("date1와 date2는 같은 날짜가 아닙니다.");
		}

		MyDate date3 = new MyDate(2024,4,16);
		MyDate date4 = new MyDate(2024,4,17);

		if (date3.equals(date4)) {
			System.out.println("date3와 date4는 같은 날짜입니다.");
		} else {
			System.out.println("date3와 date4는 같은 날짜가 아닙니다.");
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

			if(this.year == date.year && this.month == date.month && this.day == date.day) {
				return true;
			}
		}

		return false;
	}

}
