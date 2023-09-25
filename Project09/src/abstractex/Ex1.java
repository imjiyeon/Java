package abstractex;

/*
 * 추상클래스 구현하기, 상속받기
 * */
public class Ex1 {

	public static void main(String[] args) {
		// Computer computer = new Computer(); //에러발생, 추상클래스로는 인스턴스를 생성할수없다
		Computer desktop = new DeskTop();
		Computer notebook = new NoteBook();

		desktop.turnOn();
		desktop.turnOff();
		desktop.display();
		desktop.typing();
		System.out.println();
		notebook.turnOn();
		notebook.turnOff();
		notebook.display();
		notebook.typing();

	}
}

abstract class Computer { // 추상메소드가 있으면 추상클래스로 선언해야함

	// 바디가없는 추상메소드 선언
	public abstract void display();

	public abstract void typing();

	// 일반메소드 (공통기능)
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}

class DeskTop extends Computer { //구현되지 않은 메소드가 있으면 에러남

	@Override
	public void display() { //추상클래스의 구현부 작성
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}

}

class NoteBook extends Computer { //구현되지 않은 메소드가 있으면 에러남

	@Override
	public void display() { //추상클래스의 구현부 작성
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
	}

}
