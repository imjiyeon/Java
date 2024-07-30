package quiz;

public class Quiz6 {

	public static void main(String[] args) {

		//Book.class 파일 지우고 프로그램을 실행하면 NoClassDefFoundError 에러가 발생합니다.
		//프로그램이 정상적으로 종료되도록 예외를 처리하세요.
		Book book = new Book();
		
//		try {
//			Book book = new Book(); // 클래스를 찾을 수 없어서 에러남
//		} catch (NoClassDefFoundError e) { 
//			System.out.println(e);
//		}		
		
	}

}

class Book {
	
}