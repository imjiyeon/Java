package lambda;

/*
 * Hello의 구현 클래스를 만들고, helloPrint()를 호출하세요
 * Hello를 익명클래스로 구현하고, helloPrint()를 호출하세요
 * Hello를 람다식 함수로 구현하고, helloPrint()를 호출하세요
 * */

public class Quiz2 {

	public static void main(String[] args) {

		// 구현 클래스 사용하여 helloPrint() 호출
		Hello hello1 = new HelloImpl();
		hello1.helloPrint();

		// 익명클래스 사용하여 helloPrint() 호출
		Hello hello2 = new Hello() {
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
		hello2.helloPrint();

		// 람다식 함수를 사용하여 helloPrint() 호출
		Hello hello3 = () -> System.out.println("안녕하세요");
		hello3.helloPrint();

	}

}

//함수형 인터페이스 선언
interface Hello {
	// "안녕하세요"를 출력하는 함수
	void helloPrint(); 
}

//Hello의 구현 클래스
class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
	}

}
