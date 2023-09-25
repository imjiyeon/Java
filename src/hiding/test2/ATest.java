package hiding.test2;

import hiding.test1.A; //다른패키지에 있는 클래스를 사용할 때는 import문으로 사용할 클래스를 선언해주어야 한다

public class ATest {

	public static void main(String[] args) {
		A a = new A(); //다른 패키지에서도 A클래스 사용가능
	}

}
