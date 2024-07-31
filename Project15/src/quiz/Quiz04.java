package quiz;

import java.io.FileOutputStream;
import java.io.IOException;


//  <바이트 스트림>
//  
//  FileOutputStream을 사용하여 텍스트파일에 문자 A-Z까지 1바이트씩 출력하세요.
//  (파일 내용 함께 보기)

public class Quiz04 {

	public static void main(String[] args) throws IOException {

		try {
			FileOutputStream fos = new FileOutputStream("quiz4.txt");

//			fos.write('A'); //65
//			fos.write('B'); //66
//			fos.write('C'); //67
//			...
//			fos.write('Z'); //90

			// 초기값: 문자'A'의 아스키 값
			for (int i = 65; i <= 90; i++) {
				fos.write(i); // A-Z 출력
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
