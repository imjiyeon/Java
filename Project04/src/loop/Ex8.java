package loop;

/*
 * continue를 사용하여 1~10 사이의 홀수들의 합 구하기
 * */
public class Ex8 {

	public static void main(String[] args) {

		int sum = 0; //합계

		for(int i=1; i<=10; i++){ //i가 1부터 10이 될때까지, 블록을 10번 수행함
			
			//continue는 특정조건에서 건너뛰어야할때 사용할 것
			if( i%2 == 0) { //i가 짝수라면
				continue;  //다음 코드를 수행하지 않고 skip한
			} 		
			sum = sum + i; //i이 홀수라면 sum에 더하기
		}
		
		System.out.println("1부터 10까지의 홀수들의 합은 " + sum + "입니다.");
	}

}
