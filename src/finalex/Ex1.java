package finalex;

/*
 * fianl 변수
 * */
public class Ex1 {
	
	public static void main(String[] args) {		
		//프로그램에서 변하지 않는 값은 상수로 선언함 (ex.최대값 최소값 파이)
		final int MIN = 1; 
		final int MAX = 99999;
		final double PI = 3.14;
		
		final int NUM = 100; //상수는 일반변수와 구분하기 위해 대문자로 씀
		//NUM = 200; // 상수에 값을 변경하려고 해서 에러남
	}
}