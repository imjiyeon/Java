package wrapper;

/*
 * Integer 클래스의 메소드 사용하기
 * */
public class Ex2 {
	
	public static void main(String[] args) {
				
		Integer iNum = Integer.valueOf("100"); //정적메소드를 사용하여 생성자 없이 문자열을 Integer클래스로 저장
		System.out.println("iNum: " + iNum);
		
		int num = Integer.parseInt("100"); //문자열을 int값으로 변환
		System.out.println("num: " + num);
		
		String str1 = iNum.toString(); //int값을 문자열로 변환
		System.out.println("str1: " + str1);
		
		String str2 = Integer.toString(100); //정적 메소드를 사용하여 int값을 문자열로 변환
		System.out.println("str2: " + str2);

	}
	
}
