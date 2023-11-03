package override;

/* 
 * VIP 클래스의 계산 메소드 재정의하기
 * */ 
public class Ex1 {

	public static void main(String[] args) {
		Customer customer = new Customer("둘리"); //일반 회원 생성
		customer.calcPrice(10000); //일반 등급이므로 정가를 그대로 지불
		customer.showInfo();
		
		VIPCustomer vip = new VIPCustomer("또치"); //VIP 생성
		vip.calcPrice(10000); //VIP 등급이므로 10% 할인받아서 9000원을 지불
		vip.showInfo();		
	}
}

//형변환 패키지(typecasting) 예제2번 파일에서 회원 클래스 복사하기
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
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다."); //정가를 그대로 지불함
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
	}

	//generate를 사용해서 메소드 재정의하기
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio); //할인률을 적용해서 할인가 구하기
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다."); //할인된 가격을 지불
	}
}
