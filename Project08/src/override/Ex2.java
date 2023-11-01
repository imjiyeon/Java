package override;

/* 
 * 클래스 형변환과 재정의 메소드 호출하기
 * */
public class Ex2 {

	public static void main(String[] args) {		
		//형변환과 오버라이드 추가
		Customer2 vc = new VIPCustomer2("둘리"); //일반회원 참조변수로 VIP 인스턴스 생성
		vc.calcPrice(10000); //재정의된 메소드가 호출됨
		
	}
}

//예제1번 Customer와 VIP 클래스 복사
class Customer2 {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer2(String customerName) {
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

	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer2 extends Customer2 {

	double saleRatio;

	public VIPCustomer2(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer(String) 생성자 호출");
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다.");
	}
}
