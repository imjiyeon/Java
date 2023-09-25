package main;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter로 쓰기
 * */
public class Ex09 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("writer.txt"); // 문자 기반 출력 스트림 생성
			// 문자 하나 출력
			fw.write('A');
			// 문자열 출력
			fw.write("안녕하세요");
			// 특수기호 출력
			fw.write('\n');
			// 배열 출력
			char[] arr = {'a','b','c'};
			fw.write(arr);
			
			fw.flush(); //버퍼에 있는 데이터 내보내기

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
