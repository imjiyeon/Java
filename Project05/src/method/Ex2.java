package method;

/*
 * 1부터 10까지 출력하는 함수 만들고 호출하기
 */
public class Ex2 {

	// 1~10까지 출력하는 함수 선언
	public static void printTen(){ //반환할 값이 없으므로 리턴타입은 void로 선언
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		printTen(); //함수 호출
	}

}
