package innerclass;

/*
 * 외부클래스
 * */
class A {
	int i = 10;
}

class B {
	void method() {
		A a = new A();
		System.out.println(a.i); //B클래스에서 A클래스의 멤버를 사용하려면 객체를 생성해야함
	}
}