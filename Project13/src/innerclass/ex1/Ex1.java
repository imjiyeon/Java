package innerclass.ex1;

/*
 * 일반적인 클래스 만들기
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