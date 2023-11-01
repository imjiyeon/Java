package override;

/* 
 * VIP 클래스의 제품 가격 계산 메소드 재정의하기
 * */ 
public class Ex1 {

	public static void main(String[] args) {
		Customer customer = new Customer("둘리"); //일반 회원 생성
		customer.calcPrice(10000); //일반 등급이므로 정가 10000원 그대로 지불
		customer.showInfo();
		
		VIPCustomer vip = new VIPCustomer("또치"); //VIP 생성
		vip.calcPrice(10000); //VIP 등급이므로 10% 할인받아 9000원 지불
		vip.showInfo();		
	}
}

//typecasting패키지의 예제3번 Customer와 VIP 클래스 복사
class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
//		System.out.println("Customer(String) 생성자 호출");
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다."); //원가 그대로 받기
	}

	public void showInfo() {
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
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다."); //할인된 가격을 계산하여 반환
	}
}
