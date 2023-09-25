package scope;

/* 클래스 내부에 있는 모든 변수의 유효범위를 작성하세요 
 * */
class Person {
	/* 멤버변수 */
	String personName; //같은 패키지에 있는 외부 클래스에서 사용 가능. 인스턴스를 생성하면 사용 가능
	int personAge;
	
	/* 멤버변수이자 static변수 */
	static char gender = 'F'; //프로그램이 살아있는한 언제든지, 인스턴스 생성없이도 사용 가능
	
	/* 지역변수 name */
	public void setPersonName(String name) {
		this.personName = name; //name은 지역변수로 메소드 내에서만 사용 가능
	}

	public void setPersonAge(int age) {
		this.personAge = age; //personAge은 지역변수로 메소드 내에서만 사용 가능
	}
	
}


