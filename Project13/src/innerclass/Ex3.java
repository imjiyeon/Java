package innerclass;

/*
 * 내부클래스 종류와 제약사항
 * */
class OutClass {

	int a = 10;
	static int b = 20;

	class InClass{ //인스턴스 내부 클래스	
		int i1 = a;
		int i2 = b;
	}

	static class InStaticClass{ //정적 내부 클래스
		//int i1 = a;	//에러남. static 클래스 멤버는 인스턴스 멤버를 사용할 수 없음
		int i2 = b;
	}	
	
}
