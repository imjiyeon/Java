package loop;

/*
 * for문을 사용하여 1~10 사이의 홀수들의 합 구하기
 * */
public class Ex7 {

	public static void main(String[] args) {

		int sum = 0; //합을 저장할 변수 선언

		for(int i=1; i<=10; i++){ //i가 1부터 10까지 1씩 증가되므로, 블록을 10번 반복 수행한다
			if( i%2 == 0) { //조건식 추가
				continue;  //비교연산자를 사용하여 i이 짝수라면 다음 코드를 수행하지 않고 skip한다
			} 		
			sum = sum + i; //i이 홀수라면 sum에 더한다
		}
		
		System.out.println("1부터 10까지의 홀수들의 합은 :" + sum + "입니다.");
	}

}
