package loop;

/*
 * 중첩반복문을 사용하여 구구단 만들기
 * */
public class Ex10 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) { //외부for문에서 2단부터 9단까지 총 8번 수행함
			
			for (int times = 1; times <= 9; times++) { //내부for문에서 곱하는 수 1부터 9까지 총 9번 수행함
				System.out.println(dan + "X" + times + "=" + dan * times); //구구단 출력
			}
			
			System.out.println();	
		}
		
		// 2단 출력이 끝나면 다시 외부 for문으로 돌아간다
	}

}