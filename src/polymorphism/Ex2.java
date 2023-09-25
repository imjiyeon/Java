package polymorphism;

/* 
 * 다형성 테스트
 * (앞에서 구현한 쇼핑몰 회원 관리 프로그램 다시 보기)
 * */
public class Ex2 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("둘리");
		System.out.println("둘리님이 " + customer1.calcPrice(10000) + "를 결제했습니다");
		customer1.showCustomerInfo();
		
		Customer customer2 = new VIPCustomer("또치"); // VIP 회원을 Customer형으로 선언
		System.out.println("또치님이 " + customer2.calcPrice(10000) + "를 결제했습니다");
		customer2.showCustomerInfo();
		
		//출력결과를 보면 등급에 따라 다른 적립률과 할인률이 적용된 것이 확인됨
		//두 회원 모두 Customer형으로 선언되었지만 재정의된 메소드가 각각 호출되었음
		//이렇게 다형성을 활용하면 부모클래스 하나로 여러가지 인스턴스를 사용할 수 있음 (다형성의 장점)
	}
}

//override패키지의 Customer와 VIP 클래스 복사
class Customer {
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint = (int) (bonusPoint + (price * bonusRatio));
		return price;
	}

	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint = (int)(bonusPoint + (price * bonusRatio));
		return price - (int) (price * saleRatio);
	}
}
