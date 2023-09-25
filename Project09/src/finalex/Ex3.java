package finalex;

/*
 * final 메소드
 * */
class Parents {

	final void method1() { //fianl 메소드 선언	
	}
	
	void method2() {
	}
}

class Child extends Parents{

//	final void method1() { //에러남. final 메소드는 재정의 불가
//	}
	
	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}

}
