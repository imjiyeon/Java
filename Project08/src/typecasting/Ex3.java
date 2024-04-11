package typecasting;

/* 
 * 상위클래스로 형 변환하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		// 부모타입 변수 = 자식 인스턴스 생성
		Customer2 vc = new VIPCustomer2("둘리");
		System.out.println(vc.customerName); 
		
		//vc 변수는 Customer클래스가 물려준 멤버변수와 메소드만 사용 할 수 있음
		//System.out.println(vc.saleRatio); // vc변수로는 vip클래스의 할인률을 사용할 수 없음
	}
}
