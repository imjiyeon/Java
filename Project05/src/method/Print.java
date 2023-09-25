package method;

/*
 * 2. 숫자1부터10까지 출력하는 함수 만들고 호출하기
 */
public class Print {

	// 1~10까지 출력하는 함수 선언
	public static void printTen(){ //반환할 값이 없으므로 리턴타입은 void로 선언
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	//메인함수 추가하여 프린트 메소드 테스트하기
	public static void main(String[] args) {
		printTen(); //함수 호출
	}

}
