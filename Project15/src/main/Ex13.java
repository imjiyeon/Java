package main;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스 사용하기
 * */
public class Ex13 {

	public static void main(String[] args) {

		// File: 파일 정보를 담는 클래스 (활용도가 제일 높음!)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음

		// newFile.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\Users\\imjiyeon\\newFile.txt"); // 본인 파일 경로를 작성할 것

		try {
			// 실제 파일 생성
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 파일 속성 보기
		System.out.println(file.isFile()); // 파일인지?
		System.out.println(file.isDirectory()); // 폴더인지?
		System.out.println(file.getName()); // 파일이름
		System.out.println(file.getAbsolutePath()); // 파일경로
		System.out.println(file.getPath()); // 파일경로
		System.out.println(file.canRead()); // 읽을수 있는지?
		System.out.println(file.canWrite()); // 쓸수 있는지?

		// 파일 삭제
		file.delete();

		File dir = new File("C:\\Users\\imjiyeon"); // 본인 폴더 경로를 작성할 것

		// 폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();

		for (File file2 : files) {
			System.out.println(file2.toString());
		}

	}
}
