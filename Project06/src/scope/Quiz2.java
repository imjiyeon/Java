package scope;

/* 
 * 모든 변수의 유효범위를 작성하세요 (인스턴스변수,클래스변수 / 전역변수,지역변수)
 * */
class Person {
	//인스턴스변수
	String personName; //인스턴스 생성시 사용 가능
	int personAge;
	//클래스변수
	static char gender = 'F'; //인스턴스를 생성하지않아도 사용 가능	
	//지역변수
	public void setPersonName(String name) {
		this.personName = name; //메소드 안에서만 사용 가능
	}
	public void setPersonAge(int age) {
		this.personAge = age; //메소드 안에서만 사용 가능
	}
	
}


