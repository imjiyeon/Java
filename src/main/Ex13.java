package main;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스 사용하기
 * (활용도 높음)
 * */
public class Ex13 {

	public static void main(String[] args) {
		// newFile.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\Users\\imjiyeon\\newFile.txt"); // 본인 파일 경로를 작성할 것
		try {
			file.createNewFile(); // 실제 파일 생성
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.isFile()); // 파일 속성 보기
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		file.delete(); // 파일 삭제
		
		File dir = new File("C:\\Users\\imjiyeon"); // 본인 폴더 경로를 작성할 것
		File[] files = dir.listFiles(); //폴더 밑에 있는 파일 목록
		System.out.println();
	}
}
