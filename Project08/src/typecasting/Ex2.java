package typecasting;

/* 
 * super 예약어로 매개변수가 있는 생성자 호출하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		VIPCustomer2 vip = new VIPCustomer2("둘리"); //정상적으로 vip 객체 생성
	}
}

//예제1번의 Customer와 VIP 클래스 복사
class Customer2 {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	// 디폴트 생성자 삭제 또는 주석처리
//	public Customer2() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
//	}

	// 이름을 매개변수로 받는 생성자 추가
	public Customer2(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(String) 생성자 호출");
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다.");
	}

	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer2 extends Customer2 {

	double saleRatio;

//	public VIPCustomer2() {
//		super(); //에러남. 하위클래스 생성자에서 super()코드가 상위클래스의 디폴트 생성자를 호출함
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}

	public VIPCustomer2(String customerName) {
		super(customerName); //상위클래스에서 매개변수가 있는 생성자 호출
		//첫줄에 super()가 없으면 컴파일러가 자동으로 생성함
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(String) 생성자 호출");
	}

}