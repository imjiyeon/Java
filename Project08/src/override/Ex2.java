package override;

/* 
 * 부모클래스로 형변환하고 재정의된 메소드 호출하기
 * */
public class Ex2 {

	public static void main(String[] args) {		
		Customer2 vc = new VIPCustomer2("둘리"); //일반회원 참조변수 선언하고 VIP 인스턴스 생성
		vc.calcPrice(10000); //계산메소드를 호출하면 재정의된 메소드가 호출됨
	}
}

//예제1번의 회원 클래스 복사
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
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
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
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다.");
	}
}
