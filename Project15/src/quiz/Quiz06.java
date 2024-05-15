package quiz;

import java.io.FileWriter;
import java.io.IOException;


//  <문자 스트림>
//  
//  FileWriter을 사용하여 파일에 구구단을 출력하세요.
// (파일 내용 함께 보기)
 
public class Quiz06 {

	public static void main(String[] args) {
		try {

			// 출력 스트림 생성
			FileWriter fw = new FileWriter("quiz6.txt");

			// Writer는 문자열 출력 가능
			for (int i = 2; i <= 9; i++) { // 단

				for (int j = 1; j <= 9; j++) { // 곱하는 수

					fw.write(i + "*" + j + "=" + i * j + "\n"); // 줄바꿈은 특수기호로 처리
				}

				fw.write("\n");
			}

			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
