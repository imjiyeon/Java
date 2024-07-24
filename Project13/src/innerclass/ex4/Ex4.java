package innerclass.ex4;

/*
 * 인스턴스 내부 클래스와 정적 내부 클래스(2)
 * */
class Outer {

	private int a = 10; // 접근제어자를 private로 지정
	private static int b = 20;

	// 인스턴스 내부 클래스
	class InClass {
		int i1 = a; // 외부클래스의 private 멤버도 사용 가능
		int i2 = b;
	}

	// 정적 내부 클래스
	static class InStaticClass {
//		int i1 = a; // 정적클래스에서 인스턴스변수 사용불가 
		int i2 = b;
	}

}