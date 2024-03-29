package loop;

/*
 * 숫자 1부터 10까지 합 구하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		//반복문없이 처리
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println("1부터10까지의 합은 " + sum + "입니다.");

//		//반복문으로 처리
//		int num = 1; //더할 숫자
//		int sum = 0; //합계를 저장할 변수
//		
//		while(num <= 10){ //조건을 만족하는 동안 총 10번 코드를 실행
//			sum = sum + num; // num을 1씩 증가시켜서 sum에 계속 더하기
//			num++;
//		}
//		System.out.println("1부터10까지의 합은 " + sum + "입니다.");
	}
}
