package method;

/* 
 * 입력한 숫자 만큼 "안녕하세요"를 출력하는 함수를 만들고 호출하기
 * */
public class Ex4 {

	// 입력받은 숫자 만큼 안녕하세요를 출력하는 함수 선언
	public static void printHello(int cnt){ //반환할 값이 없으므로 리턴타입은 void로 선언, 출력할 숫자는 매개변수로 선언
		for(int i=1;i<=cnt;i++) {
			System.out.println("안녕하세요");
		}
	}
	
	public static void main(String[] args) {
		printHello(3); //함수 호출
	}

}
