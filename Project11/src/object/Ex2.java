package object;

/*
 * Object 클래스에서 상속받은 메소드 알아보기
 * */
public class Ex2 {

	public static void main(String[] args) {
		A a = new A();
		a.toString(); //object에서 상속받은 메소드 사용하기
	}
}

class A { // 자동으로 Object 클래스 상속받음
	//오버라이드 메뉴에서 상속받은 메소드 보기
}
