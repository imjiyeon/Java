package constructor;

/*
 * 생성자 만들고 테스트하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		Person1 personA = new Person1(); //컴파일러가 자동으로 제공하는 디폴트 생성자 사용
		
		//Person2 personB = new Person2(); //에러남. 클래스에 생성자를 직접 만들었기 때문에 컴파일러가 디폴트생성자를 만들지 않았음.
		Person2 personC = new Person2("둘리"); //인스턴스 생성과 동시에 이름 초기화
	}
}

class Person1 {
	String name;
	int height;
	int weight;
}

// 생성자 만들기
class Person2 {
	String name;
	int height;
	int weight;
	
	// 이름을 매개변수로 받아서 초기화하는 생성자
	public Person2(String nm) {
		name = nm;
	}
	
	// 디폴트 생성자 직접 추가
//	public Person2() {	
//	}
}