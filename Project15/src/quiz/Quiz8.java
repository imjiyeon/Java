package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * <파일 클래스>
 * 
 * 이전 예제를 함수형태로 변경하세요.
 * */
public class Quiz8 {

	public static void main(String[] args) throws IOException {

//		String filepath = "C:\\Users\\그린302\\Downloads\\Exam";
		String filepath = "C:\\Users\\imjiyeon\\Downloads";
		FileWriter fw = new FileWriter("quiz7.txt");

		printFileList(filepath, fw);

	}

	public static void printFileList(String filepath, FileWriter fw) throws IOException {

		File dir = new File(filepath);
		File[] files = dir.listFiles(); // 폴더 밑에 있는 파일 목록

		for (int i = 0; i < files.length; i++) {
			File file = files[i]; // 배열에서 파일 꺼내기
			String filename = file.getName(); // 파일 이름
			fw.write(filename); // 파일 이름 출력
			fw.write("\n");
		}
		fw.flush();
	}
}
