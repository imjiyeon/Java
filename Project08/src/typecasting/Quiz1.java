package typecasting;

/*
 * 부모클래스와 자식클래스를 정의하세요.
 * 부모클래스 참조변수를 선언하고 자식 클래스로 생성한 인스턴스를 대입하세요.
 * 그리고 자식클래스의 정보를 출력하세요.
 * */

public class Quiz1 {
	public static void main(String[] args) {		
		Parents pc = new Child("한국","고","길동"); //부모타입 변수 선언 = 자식클래스 인스턴스 생성
		System.out.println(pc.lastName); //pc변수는 Parents클래스의 멤버변수만 사용할 수 있음
		System.out.println(pc.nationality);
		//System.out.println(pc.firstName); //pc변수로 자식클래스의 이름은 사용할 수 없음
	}
}

class Parents {
	String nationality; //국적
	String lastName; //성

	//국적과 성을 입력받아 인스턴스를 생성하는 생성자
	public Parents(String nationality, String lastName){
		this.nationality = nationality;
		this.lastName = lastName;
	}
}

class Child extends Parents{
	String firstName; //이름
	
	//국적, 성, 이름을 입력받아 인스턴스를 생성하는 생성자
	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName); // 부모에 디폴트 생성자가 없으므로 super(); 코드는 사용할 수 없음
		this.firstName = firstName;
	}

}