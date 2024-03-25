package quiz;

/*
 * <연산자 우선순위>
 * 코드를 보고 풀이과정과 예상결과를 주석으로 작성하세요
 * */
public class Quiz10 {

	public static void main(String[] args) {

		int result1 = -5 + 3 * 10 / 2; //
		
		//답:
//		int result1 = -5 + 3 * 10 / 2; // +보다 * /가 더 연산순위가 높으니까 3*10/2가 먼저 수행됨. 그리고 -5 + 15가 수행됨
//		System.out.println(result1); //10

		int x = 1;
		int result2 = (++x) + 5; //
		
		//답:	
//		int x = 1;
//		int result2 = (++x) + 5; //증가연산자가 먼저 x값을 1증가시키고, + 5를 수행함 -> 2 + 5
//		System.out.println(result2); //7
		
	}

}
