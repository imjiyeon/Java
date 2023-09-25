package quiz;

/*
 * 다음 코드를 실행하면 에러가 발생합니다.
 * 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		
		Object x = new Integer(0);
		System.out.println( (String)x ); // Integer클래스를 String클래스로 형변환

//		try {
//			Object x = new Integer(0);
//			System.out.println( (String)x );
//		} catch (ClassCastException e) {
//			System.out.println(e);
//		}
	}

}