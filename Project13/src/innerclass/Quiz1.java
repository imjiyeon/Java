package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * 다음 코드를 익명클래스로 변경하세요.
 * */
public class Quiz1 {
	public static void main(String[] args) {
		// 화면 생성
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);

		// 미리 구현한 클래스로 키이벤트 등록하기
		KeyAdapter adapter = new MyKeyListener();
		frame.addKeyListener(adapter);
		
		// Q.익명클래스를 사용하여 키이벤트를 등록하세요
//		frame.addKeyListener(new KeyAdapter() {
//			public void keyPressed(KeyEvent e) {
//				System.out.println("키를 눌렀습니다!");
//			}
//		});
	}
}

class MyKeyListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 눌렀습니다!");
	}
	
}
