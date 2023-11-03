package typecasting;

/* 
 * 상위클래소 형 변환하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		// 부모타입 변수 = 자식 인스턴스 생성
		Customer3 vc = new VIPCustomer3("둘리");
		System.out.println(vc.customerName); 
		
		//vc 변수는 Customer클래스가 물려준 멤버변수와 메소드만 사용 할 수 있음
		//System.out.println(vc.saleRatio); //vip클래스의 할인률을 사용할 수 없음
	}
}

//이전에 작성한 Customer와 VIP 클래스 복사
class Customer3 {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer3(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
//		System.out.println("Customer(String) 생성자 호출");
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer3 extends Customer3 {

	double saleRatio;

	public VIPCustomer3(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer(String) 생성자 호출");
	}

}