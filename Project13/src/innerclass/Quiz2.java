package innerclass;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

// 두가지 방법으로 addFocusListener 이벤트를 등록해주세요~
// 1. 일반 클래스 사용
// 2. 익명클래스 사용
// textarea 안으로 마우스가 들어오면 "텍스트에 포커스가 되었습니다!!" 출력..
// textarea 밖으로 마우스가 벗어나면 "텍스트에 포커스가 벗어났습니다!" 출력..

public class Quiz2 {
	public static void main(String[] args) {
		// 화면 생성
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		
		TextArea textArea = new TextArea("텍스트상자",10,50);
		frame.add(textArea);
		
		frame.setVisible(true);

		// 미리 구현한 클래스로 키이벤트 등록하기
//		MyFocusListener listener = new MyFocusListener();
//		textArea.addFocusListener(listener);

		// 익명클래스로 키 이벤트 등록하기
		textArea.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스가 되었습니다!");
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("텍스트에 포커스가 벗어났습니다!");
			}
		});
	}
}

class MyFocusListener implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("텍스트에 포커스가 되었습니다!");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("텍스트에 포커스가 벗어났습니다!");
	}

}
