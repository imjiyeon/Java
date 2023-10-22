package loop;

/*
 * 안녕하세요 10번 출력하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		//반복문없이 처리
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		//반복문으로 처리
		int num = 1; //조건문에서 사용할 변수
		while (num <= 10) { // 조건을 만족하는 동안 블록을 10번 실행
			System.out.println("안녕하세요");
			num++;
		}

	}

}
