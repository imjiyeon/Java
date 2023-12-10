package innerclass;

/*
 * 익명클래스 사용하기
 * */

//Runnable: 스레드를 구현할 때 사용하는 인터페이스
//스레드: 하나의 프로그램에서 여러작업을 동시에 실행하는 것

//Runnable 인터페이스를 상속받아서 구현 클래스 만들기
class RunnableChild implements Runnable {
	@Override
	public void run() {
		System.out.println("running...");
	}
}

public class Ex6 {

	public static void main(String[] args) {
		
		//미리 구현한 클래스를 사용하여 객체 생성
		RunnableChild child = new RunnableChild();
		child.run(); //인터페이스 사용
		
	}

}