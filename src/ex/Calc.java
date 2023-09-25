package ex;

/*
 * 계산기 인터페이스 만들기
 * */
public interface Calc {
	
	int ERROR = -9999; //인터페이스에 선언한 변수는 자동으로 상수가됨. 오류가 났을 때 사용할 에러코드
	
	int add(int num1, int num2); //인터페이스에 선언한 메소드는 자동으로 추상메소드가 됨. 더하기 메소드
	int substract(int num1, int num2); //빼기 메소드
	int times(int num1, int num2); //곱하기 메소드
	int divide(int num1, int num2); //나누기 메소드

}
