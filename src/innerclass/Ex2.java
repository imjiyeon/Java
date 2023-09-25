package innerclass;

/*
 * 내부클래스
 * */
class Outer { //외부 클래스

	int a = 10;

	class Inner { //내부 클래스	
		int b = 100;
		int c = 200;
		
		public void method1() {
			System.out.println(a); //외부 클래스 생성없이 멤버를 그냥 사용할 수 있음
		}
	}
}