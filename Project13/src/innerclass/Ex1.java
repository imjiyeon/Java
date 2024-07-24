package innerclass;

/*
 * 일반적인 클래스
 * */
class A {
	int num = 10;
}

class B {
	
	void method() {
		A a = new A();
		System.out.println(a.num); //B클래스에서 A클래스의 멤버를 사용하려면 객체를 생성해야함
	}
	
}

/*
 * 내부 클래스
 * */
class C { //외부 클래스

	int num = 10;

	class D { //내부 클래스	
		
		void method() {
			System.out.println(num); //객체 생성없이 멤버를 그냥 사용할 수 있음
		}
		
	}
	
}