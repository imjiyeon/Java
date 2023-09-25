package wrapper.quiz;

/*
 * "10" 문자열을 Byte, Short, Integer, Long타입 변수에 정수값으로 저장하세요
 * "10.0" 문자열을 Float, Double타입 변수에 실수값으로 저장하세요
 * */
public class Quiz3 {

	public static void main(String[] args) {

		Byte bNum = Byte.parseByte("10"); //문자열을 byte값으로 변환 
		Short sNum = Short.parseShort("10"); //"10" -> 10
		Integer iNum = Integer.parseInt("10");
		Long lNum = Long.parseLong("10");
		
		Float fNum = Float.parseFloat("10.0"); //문자열을 float값으로 변환 
		Double dNum = Double.parseDouble("10.0");
		
	}
}
