package override;

/* 
 * 부모클래스로 형변환하고 재정의된 메소드 호출하기
 * */
public class Ex2 {

	public static void main(String[] args) {		
		Customer vc = new VIPCustomer("둘리"); //일반회원 참조변수 선언하고 VIP 인스턴스 생성
		vc.calcPrice(10000); //계산메소드를 호출하면 재정의된 메소드가 호출됨
	}
}
