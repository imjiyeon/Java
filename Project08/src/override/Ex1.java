package override;

/* 
 * VIP 클래스의 제품 가격 계산 메소드 재정의하기
 * */ 
public class Ex1 {

	public static void main(String[] args) {
		Customer customer = new Customer("둘리"); //일반 회원 생성
		System.out.println("둘리님이 " + customer.calcPrice(10000) + "를 결제했습니다"); //일반 등급이므로 정가 10000원 그대로 지불
		customer.showCustomerInfo();
		
		VIPCustomer vip = new VIPCustomer("또치"); //VIP 생성
		System.out.println("또치님이 " + vip.calcPrice(10000) + "를 결제했습니다"); //VIP 등급이므로 10% 할인받아 9000원 지불
		vip.showCustomerInfo();		
	}
}

//typecasting패키지의 예제3번 Customer와 VIP 클래스 복사
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
//		System.out.println("Customer(String) 생성자 호출");
	}

	public int calcPrice(int price) {
		bonusPoint = (int) (bonusPoint + (price * bonusRatio));
		return price; //원가 그대로 받기
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
//		System.out.println("VIPCustomer(String) 생성자 호출");
	}

	//재정의한 메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint = (int)(bonusPoint + (price * bonusRatio));
		return price - (int) (price * saleRatio); //할인된 가격을 계산하여 반환
	}
}
