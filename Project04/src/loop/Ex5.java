package loop;

/*
 * for문을 사용하여 1부터 10까지 합 구하기
 * */
public class Ex5 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i=1; i<=10; i++){//i가 1부터 10까지 1씩 증가되므로, 블록을 10번 반복 수행한다
			sum = sum + i;
		}	
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
				
//		/* for문을 while문으로 변경한다면 */
//		int num = 1; //더할 숫자
//		int sum = 0; //합계를 저장할 변수
//		while(num <= 10){
//			sum = sum + num;
//			num++;
//		} //for문과 비교하면 for문이 더 가독성이 좋은 것을 알 수 있다
//		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
//		/* 반복문 없이 코드를 구현한다면 */
//		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
//		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}

