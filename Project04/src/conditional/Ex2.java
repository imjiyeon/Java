package conditional;

import java.io.IOException;

/*
 * <if~else문>
 * 나이가 8살 이상이면 '학교에다닙니다', 그렇지 않으면 '학교에다니지않습니다' 출력
 * */
public class Ex2 {

	public static void main(String[] args) throws IOException {

		int age = 10; // 7로 바꿔보기
		if (age >= 8) { //나이가 8살이상이면
			System.out.println("학교에 다닙니다"); // 참이면 수행
		} else { //그렇지 않다면
			System.out.println("학교에 다니지않습니다"); // 거짓이면 수행
		}
	}
}
