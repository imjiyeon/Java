package hiding;

/*
 * private 변수와 get/set 함수 사용하기
 * */
public class Ex2 {
	public static void main(String[] args) {
		//public변수 집적 사용하기
		MyDate date = new MyDate();
		date.month = 2;
		date.day = 31; // 2월은 28일이나 29일까지 인데 31일이 저장됨. 잘못된 값이 저장됨
		System.out.println("현재 날짜는 " + date.month + "월 " + date.day + "일 입니다");
		
//		//public메소드를 통해서 private변수 사용하기
//		MyDate date = new MyDate(); //달력 생성
//		date.setMonth(2); //2월 저장
//		date.setDay(30); //30일 저장 실패. 검증 실패하여 저장되지 않음.		
//		date.setDay(10); //10일 저장 성공	
//		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일 입니다");
	}
}

class MyDate {
	public int month; //월
	public int day; //일	
	
//	private int month; //월
//	private int day; //일
//	
//	public int getMonth() {
//		return month;
//	}
//	public void setMonth(int month) {
//		this.month = month;
//	}
//	public int getDay() {
//		return day;
//	}
//	//새로들어온 값이 올바른 일자인지 확인하고 저장한다
//	public void setDay(int day) {
//		//month가 2월 일때, 새로운일자가 1~28일이라면 저장
//		if(month == 2) { //1,3,4,...
//			if(day < 1 || day > 28) { //아니라면 값을 저장하지 않는다
//				System.out.println("2월에는 " + day + " 일이 없습니다!!");
//				return;
//			}
//		}
//		
//		this.day = day;
//	}
	
}
