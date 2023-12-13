package quiz;

/*
 * 다음 코드를 실행하면 에러가 발생합니다.
 * 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		
		Object obj = new Integer(0);
		String str = (String) obj;

//		try {
//			Object obj = new Integer(0);
//			String str = (String ) obj; // 형변환을 잘못해서 에러남
//		} catch (ClassCastException e) {
//			System.out.println(e);
//		}
		
	}

}