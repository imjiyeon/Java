package wrapper;

/*
 * Integer 클래스 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		
		//Integer는 클래스이기 때문에 생성자를 호출해야함 
		Integer iNum1 = new Integer(100);	
		//하지만 자바5부터 값만 저장하도록 바뀌었음
		Integer iNum2 = 100; //생성자 없이 Integer 클래스 생성. 기본형->객체형 (오토박싱)	
		System.out.println("iNum1: " + iNum1);
		System.out.println("iNum2: " + iNum2);
		
		//Integer클래스 안에 저장된 값 꺼내기
		int num1 = iNum1.intValue();
		int num2 = iNum1; // 객체형->기본형 (언박싱)
		int num3 = iNum1 + num2; //기본형과 Wrapper클래스를 함께 연산하기 위해 iNum1가 기본형으로 변환됨
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);

	}
}
