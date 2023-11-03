package override;

/*
 * 컴퓨터,노트북,데스크탑 클래스를 정의하세요.
 * 커피클래스에서 상속받은 메소드를 재정의하세요 on() off()
 * */
public class Quiz3 {
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		
		Computer computer2 = new Notebook();
		computer2.on();
		computer2.off();
		
		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();		
	}
}

class Computer {
	
	public void on() {
		System.out.println("컴퓨터를 켭니다");
	} 
	
	public void off(){
		System.out.println("컴퓨터를 끕니다");
	}
}

class Notebook extends Computer {

	@Override
	public void on() {
		System.out.println("노트북을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끕니다");
	}
	
}

class Desktop extends Computer {
	@Override
	public void on() {
		System.out.println("데스크탑을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끕니다");
	}
}