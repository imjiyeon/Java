package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * <파일 클래스>
 * 
 * 이전 예제를 함수형태로 변경하세요.
 * */
public class Quiz09 {

	public static void main(String[] args) throws IOException {

		// 디렉토리 경로
		String filepath1 = "e:\\Users\\205-T\\Downloads";

		String filepath2 = "D:\\imjiyeon\\tools";

		// 출력 스트림
		FileWriter fw = new FileWriter("quiz9.txt");

		// 함수 호출
		printFileList(filepath2, fw);

	}

	// 디렉토리 밑에 있는 파일 목록을 출력하는 메소드
	// 매개변수: 디렉토리 경로, 출력 스트림
	public static void printFileList(String filepath, FileWriter fw) throws IOException {

		// 파일 생성
		File dir = new File(filepath);

		// 폴더 밑에 있는 파일 목록 꺼내기
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			File file = files[i]; // 배열에서 파일 꺼내기
			String filename = file.getName(); // 파일 이름 꺼내기
			fw.write(filename); // 파일 이름 출력
			fw.write("\n");
		}

		fw.flush();
	}
}
