package override;

/*
 * 컴퓨터,노트북,데스크탑 클래스를 정의하세요.
 * 커피클래스에서 상속받은 메소드를 재정의하세요 on() off()
 * */
public class Quiz3 {
	public static void main(String[] args) {
		// 오버라이드 안하고 코드를 실행하면 부모가 물려준 메소드 원형이 실행됨 
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		
		// 형변환된 변수로 메소드를 호출하면 실제 객체가 가지고 있는 메소드가 호출됨
		Computer computer2 = new Notebook();
		computer2.on();
		computer2.off();
		
		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();		
	}
}

// 컴퓨터 클래스
class Computer {
	
	public void on() {
		System.out.println("컴퓨터를 켭니다");
	} 
	
	public void off(){
		System.out.println("컴퓨터를 끕니다");
	}
}

// 노트북 클래스
class Notebook extends Computer {

	// 노트북에 맞게 메소드를 재정의
	@Override
	public void on() {
		System.out.println("노트북을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끕니다");
	}
	
}

// 데스크탑 클래스
class Desktop extends Computer {

	// 데스크탑에 맞게 메소드를 재정의
	@Override
	public void on() {
		System.out.println("데스크탑을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끕니다");
	}
}