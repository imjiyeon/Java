package quiz;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * <바이트 스트림>
 * 
 * FileOutputStream을 사용하여 텍스트파일에 문자 A-Z까지 출력하세요. 
 * (파일 내용 보기)
 * */
public class Quiz04 {

	public static void main(String[] args) throws IOException {

		try {
			FileOutputStream fos = new FileOutputStream("quiz4.txt");
			byte data = 65; // 'A'의 아스키 값

			for (int i = 0; i < 26; i++) {
				fos.write(data); // A-Z 출력
				data++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
