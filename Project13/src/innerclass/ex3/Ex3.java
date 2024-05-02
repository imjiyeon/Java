package innerclass.ex3;

/*
 * 내부클래스 종류와 제약사항 (1)
 */
public class Ex3 {

	public static void main(String[] args) {

		// 인스턴스 내부 클래스의 인스턴스 생성
		Outer outer = new Outer();
		Outer.InstanseInner instanseInner = outer.new InstanseInner();
		instanseInner.i1 = 300; // 인스턴스 변수 사용
		instanseInner.i2 = 300; // 정적변수 사용

		Outer outer2 = new Outer();
		Outer.InstanseInner instanseInner2 = outer2.new InstanseInner();
		instanseInner2.i1 = 400; // 인스턴스 변수 사용
		instanseInner2.i2 = 400; // 정적변수 사용

		System.out.println("첫번째 인스턴스 내부클래스: " + instanseInner.i1 + ", " + instanseInner.i2);
		System.out.println("두번째 인스턴스 내부클래스: " + instanseInner2.i1 + ", " + instanseInner2.i2);
		// i2는 외부클래스의 멤버변수라고 보면됨

		// 정적 내부 클래스의 인스턴스 생성. Outer 객체를 없이 사용 가능
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.i1 = 300;
		staticInner.i2 = 300;
	}
}

class Outer {

	// 인스턴스 클래스는 인스턴스변수와 정적변수를 모두 가질 수 있음
	class InstanseInner {
		int i1 = 100;
		static int i2 = 200; // 단, 외부 객체없이는 사용할 수 없기때문에 정적변수는 외부 객체에 종속됨
	}

	// 정적 클래스는 인스턴스변수와 정적변수를 모두 가질 수 있음
	static class StaticInner {
		int i1 = 100;
		static int i2 = 200;
	}

}