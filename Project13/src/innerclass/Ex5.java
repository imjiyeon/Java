package innerclass;

/*
 * 익명클래스
 * */

//인터페이스를 상속받아서 구현클래스 만들기
class RunnableChild implements Runnable {
	@Override
	public void run() {
		System.out.println("running...");
	}
}

public class Ex5 {

	public static void main(String[] args) {
		
		//1.미리 구현한 클래스로 객체 생성
		Runnable child = new RunnableChild();
		child.run(); //인터페이스 사용
		
		//2.익명클래스로 구현과 동시에 객체 생성
		Runnable runnerble = new Runnable() {
			@Override
			public void run() {
				System.out.println("running...");
			}
		};
		runnerble.run(); //인터페이스 사용
	}

}