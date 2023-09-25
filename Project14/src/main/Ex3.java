package main;

/*
 * try-catch문으로 예외처리하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			arr[5] = 5; //1.예외가 발생할 가능성이 있는 코드 작성한다
		} catch(IndexOutOfBoundsException e) { //2.해당 예외 클래스를 사용한 catch문 작성
			System.out.println(e); //3.예외가 발생하면 처리할 코드를 작성
		} 
		System.out.println("프로그램이 정상 종료됩니다.");

	}
	
	/* <예외처리 흐름>
	 * 예외가 발생한다.
	 * 일치하는 catch 블록을 찾는다.
	 * catch블록의 코드를 수행하고, 다음 문장을 계속해서 수행한다.
	 * */

}
