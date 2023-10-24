package hiding;

/*
 * public 변수 선언하고 값 변경하기
 * */
public class Ex1 {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.month = 2; // 멤버변수 직접 사용
		date.day = 31; // 2월은 28일이나 29일까지 인데 31일이 저장됨
		System.out.println("현재 날짜는 " + date.month + "월 " + date.day + "일 입니다");

		// public변수는 잘못된 값이 저장되는 것을 막을 수 없음
	}
}

class MyDate {
	public int month; // 월
	public int day; // 일
}
