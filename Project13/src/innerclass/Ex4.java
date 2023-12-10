package innerclass;

/*
 * 내부클래스 종류와 제약사항 (2)
 * */
class OutClass2 {
	
	private int a = 10;	//접근제어자를 private로 변경
	static int b = 20;

	class InClass{
		int i1 = a;	//외부클래스의 private 멤버도 사용 가능
		int i2 = b;
	}

	static class InStaticClass{
		int i2 = b;
	}	
	
	void method(){
		int i = 100;
		
		class LocalInner { //지역 내부 클래스
			void innerMethod() {
				//i = 200; //에러남. i는 상수이므로 값을 변경할 수 없음

				//메소드는 호출 후 바로 종료 되지만, 객체는 계속 메모리에 존재한다.
				//따라서 지역변수보다 클래스의 생애주기가 더 길기 때문에, 지역변수는 값을 변경할 수없도록 fianl 상수가 된다.
			}
		}
	}
	
}