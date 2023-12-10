package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 익명클래스 사용하기
 * */

public class Ex7 {

	public static void main(String[] args) {

		// 1.프레임 생성
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		Button button = new Button("Click");
		frame.add(button);
		
		// 2.버튼이벤트 등록
		
		// 익명클래스 만들고, 바로 객체 생성하기		
		button.addActionListener(new ActionListener () { // 인자에 클래스를 직접 대입
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다!");
			}
		});

	}

}