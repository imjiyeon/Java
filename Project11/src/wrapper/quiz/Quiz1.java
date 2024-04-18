package wrapper.quiz;


//  <wrapper 클래스 메소드 사용하기>
//
//  문자열 "10"을 byte, short, int, long 으로 변환하세요.
//  문자열 "10.0" 을 float, double 로 변환하세요.

public class Quiz1 {

	public static void main(String[] args) {

		// 문자열을 숫자로 변환하려면 "parse" 메소드를 사용해야함	
		byte bNum = Byte.parseByte("10"); //"10" -> 10
		short sNum = Short.parseShort("10");
		int iNum = Integer.parseInt("10");
		long lNum = Long.parseLong("10");
		
		float fNum = Float.parseFloat("10.0"); //"10.0" -> 10.0
		double dNum = Double.parseDouble("10.0");
		
		Double double1 = Double.parseDouble("10.0"); // 오토박싱됨
		
	}
}
