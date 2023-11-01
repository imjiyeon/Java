package typecasting;

public class Quiz1 {
	public static void main(String[] args) {		
		Parents pc = new Child("한국","고","길동"); //부모타입 변수 선언 = 자식클래스로 인스턴스 생성
		System.out.println(pc.lastName); //pc변수는 Parents클래스의 멤버변수만 사용 가능
		System.out.println(pc.nationality);
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
		super(nationality, lastName);
		this.firstName = firstName;
	}

}