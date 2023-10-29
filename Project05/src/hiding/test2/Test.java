package hiding.test2;

import hiding.test1.A; //다른패키지에 있는 클래스를 사용할 때는 import문 선언해야함
//import hiding.test1.B;

public class Test {

	public static void main(String[] args) {
		A a = new A(); //외부 패키지에서 사용가능
//		B b = new B(); //외부 클래스에서 사용불가
	}

}
