package scope;

/* 클래스 내부에 있는 모든 변수의 유효범위를 작성하세요 
 * */
class A {

	public int field1; //클래스 외부 어디서든 사용 가능
	int field2; //같은 패키지에 있는 외부 클래스에서 사용 가능
	private int field3; //클래스 내부에서만 사용 가능
	
}

