package typecasting;

/* 
 * 자식클래스가 생성되는 과정 확인하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		VIPCustomer vip = new VIPCustomer(); // 자식클래스의 인스턴스 생성
		
		// 부모클래스의 생성자가 먼저 실행되고, 다음에 자식클래스의 생성자가 실행됨
		// 부모클래스의 생성자가 호출될 때 이름,등급,포인트,적립률 속성이 생성됨
		// 자식클래스의 생성자가 호출될 때 할인률 속성이 생성됨
	}
}

//상속패키지(inheritance)에서 Customer와 VIP 클래스 가져오기
class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출"); // 생성자 호출시 문장 출력하기 (추가)
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출"); // 생성자 호출시 문장 출력하기 (추가)
	}

}