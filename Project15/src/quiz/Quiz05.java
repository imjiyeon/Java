package quiz;

import java.io.FileWriter;
import java.io.IOException;


// <문자 스트림>
//  
// FileWriter을 사용하여 텍스트파일에 숫자 1부터 10 중에서 짝수를 출력하세요.
// (파일 내용 함께 보기)
 
public class Quiz05 {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("quiz5.txt");

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {

//				fw.write(i); //숫자로 인식 -> 코드체계에따라 문자로 변환

				fw.write(i + " "); //문자로 인식

			}

		}
		
		fw.flush();
		
	}
}
