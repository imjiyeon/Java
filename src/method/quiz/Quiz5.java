package method.quiz;

/* 
 * 입력한 숫자 만큼 안녕하세요를 출력하는 함수를 만들고 호출한다
 * 
 * 숫자3 입력 ->
 * 안녕하세요
 * 안녕하세요
 * 안녕하세요
 * */
public class Quiz5 {

	// 입력받은 숫자 만큼 안녕하세요를 출력하는 함수 선언
	public static void printHello(int cnt){
		for(int i=1;i<=cnt;i++) {
			System.out.println("안녕하세요");
		}
	}
	
	//메인함수 추가하여 프린트 메소드 테스트하기
	public static void main(String[] args) {
		printHello(5); //함수 호출
	}

}
