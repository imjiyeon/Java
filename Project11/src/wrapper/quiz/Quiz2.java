package wrapper.quiz;

/*
 * <wrapper 클래스 메소드 사용하기>
 * 
 * 문자열 "10"을 Byte, Short, Integer, Long타입 변수에 저장하세요.
 * 문자열 "10.0" 을 Float, Double타입 변수에 저장하세요.
 * */
public class Quiz2 {

	public static void main(String[] args) {

		// 문자열을 숫자타입 변수에 저장하려면 "parse" 메소드를 사용해야함	
		Byte bNum = Byte.parseByte("10"); //"10" -> 10
		Short sNum = Short.parseShort("10");
		Integer iNum = Integer.parseInt("10");
		Long lNum = Long.parseLong("10");
		
		Float fNum = Float.parseFloat("10.0"); //"10.0" -> 10.0
		Double dNum = Double.parseDouble("10.0");
		
	}
}
