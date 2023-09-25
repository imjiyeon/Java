package object;

/*
 * Object 클래스에서 상속받는 메소드 보기
 * */
public class Ex2 {

	public static void main(String[] args) {
		A a = new A();
		a.toString(); //참조변수로 상속받은 Object 메소드 확인		
	}
}

class A {
	//오버라이드 메뉴에서 상속받은 Object 메소드 확인
}
