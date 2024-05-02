package innerclass;

import java.awt.*; // 수동으로 import문 작성
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 익명클래스 사용하기
 * */

public class Ex6 {

	public static void main(String[] args) {

		// 1. 화면 만들기
		Frame frame = new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300); // X좌표, Y좌표, 넓이, 높이
		frame.setVisible(true); // setVisible(true)를 해 줘야 눈으로 확인 가능
		Button button = new Button("Click");
		frame.add(button);

		// 2. 버튼 이벤트 등록하기

		// 미리 구현한 클래스를 사용하여 객체 생성
		button.addActionListener(new EventHandler());

		// 익명클래스 만들고, 바로 객체 생성하기
		button.addActionListener(new ActionListener() { // 인자에 클래스를 직접 대입
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다!");
			}
		});

	}

}

//awt: 화면 기반 어플리케이션을 개발하기 위한 라이브러리이다

//ActionListener 인터페이스를 상속받아서 구현 클래스 만들기
class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다!");
	}

}