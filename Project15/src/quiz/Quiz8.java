package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력하세요.
 * 만약 하위 폴더가 있다면, 하위폴더의 파일목록도 출력하세요.
 * (파일 내용 보기)
 * */
public class Quiz8 {

	public static void main(String[] args) throws IOException {

		String filepath = "C:\\Users\\imjiyeon\\Downloads";
		FileWriter fw = new FileWriter("quiz8.txt");

		printFileList(filepath, fw);

	}

	public static void printFileList(String filepath, FileWriter fw) throws IOException {

		File dir = new File(filepath);
		File[] files = dir.listFiles(); // 폴더 밑에 있는 파일 목록

		for (int i = 0; i < files.length; i++) {

			File file = files[i]; // 배열에서 파일 꺼내기
			boolean isDirectory = file.isDirectory(); // 디렉토리 여부
			String filename = file.getName(); // 파일 이름
			fw.write(filename); // 파일 이름 출력

			if (isDirectory) { // 폴더라면
				fw.write("\n====>\n");
				String subfilepath = file.getPath();
				printFileList(subfilepath, fw); // 자기 자신을 호출하는 재귀함수
			}

			fw.write("\n");
			fw.flush();
		}
	}
}
