package main;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * <바이트 단위 스트림>
 * 배열을 사용해서 파일 읽기
 * */
public class Ex05 {

	public static void main(String[] args) {

		// input3.txt 파일 만들고 A-Z 작성하기

		try {
			// 파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input3.txt");

			// 배열 생성
			byte[] arr = new byte[10];

			// 읽어들인 요소의 개수 저장
			int size;

			// 파일의 내용을 10 바이트씩 읽어오기
			while (true) {

				// 파일의 내용을 읽어서 배열에 저장하고, 읽어온 문자의 크기 반환
				size = fis.read(arr);

				// 파일의 끝에 도달하면 루프 종료
				if (size == -1) {
					break;
				}

				// 읽어들인 크기만큼 배열요소를 출력
				for (int i = 0; i < size; i++) {
					System.out.print((char) arr[i]);
				}
				
				System.out.println(": " + size + "바이트 읽음");
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
