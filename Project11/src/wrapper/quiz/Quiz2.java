package wrapper.quiz;

/*
 * 정수 10을 문자열 변수 iStr에 "10"으로 저장하세요
 * 실수 1.123을 문자열 변수 dStr에 "1.123"으로 저장하세요
 * 문자 c를 문자열 변수 cStr에 "c"으로 저장하세요
 * true값을 문자열 변수 bStr에 "true"으로 저장하세요
 * */
public class Quiz2 {

	public static void main(String[] args) {
		
		String sStr = Integer.toString(10); //int값을 문자열로 변환 
		System.out.println("sStr: " + sStr); // 10 -> "10"

		String dStr = Double.toString(1.123); // 1.123 -> "1.123"
		System.out.println("dStr: " + dStr);
		
		String cStr = Character.toString('c'); // 'c' -> "c"
		System.out.println("cStr: " + cStr);
		
		String bStr = Boolean.toString(true); // true -> "true"
		System.out.println("bStr: " + bStr);
		
	}
}
