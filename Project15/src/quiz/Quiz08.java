package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * <파일 클래스>
 * 
 * 다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력하세요.
 * (파일 내용 보기)
 * */
public class Quiz08 {

	public static void main(String[] args) throws IOException {

		// 다운로드 폴더와 연결된 파일 클래스 생성
//		File dir = new File("C:\\Users\\G201\\Downloads");
		File dir = new File("C:\\Users\\imjiyeon\\Downloads");
		
		// 폴더 밑에 있는 파일 목록 읽어오기 읽어오기
		File[] files = dir.listFiles();

		// 출력 스트림 생성
		FileWriter fw = new FileWriter("quiz8.txt");

		for (int i = 0; i < files.length; i++) {
			// 파일 이름 꺼내서
			File file = files[i];
			String filename = file.getName();
			// 텍스트 파일에 쓰기
			fw.write(filename);
			fw.write("\n");
		}

		// 버퍼 비우기
		fw.flush();

	}
}
