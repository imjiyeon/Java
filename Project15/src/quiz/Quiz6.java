package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * quiz6.txt파일을 만드세요.
 * 다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력하세요.
 * (파일 내용 보기)
 * */
public class Quiz6 {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("C:\\Users\\imjiyeon\\Downloads");
		File[] files = dir.listFiles(); //폴더 밑에 있는 파일 목록
		
		FileWriter fw = new FileWriter("quiz6.txt");
		
		for(int i=0;i<files.length;i++) {
			File file = files[i];
			String filename = file.getName();
			fw.write(filename);
			fw.write("\n");
		}

		fw.flush();
		
	}
}
