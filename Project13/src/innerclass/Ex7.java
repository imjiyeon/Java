package innerclass;

/*
 * 익명클래스 사용하기
 * */

public class Ex7 {

	public static void main(String[] args) {

		// 익명클래스 만들고, 바로 객체 생성하기
		
		// 인터페이스 변수 선언하고 클래스를 직접 대입
		Runnable runnerble = new Runnable() { 
			@Override
			public void run() {
				System.out.println("running...");
			}
		}; //콜론으로 마무리
		
		runnerble.run(); //인터페이스 사용
	}

}