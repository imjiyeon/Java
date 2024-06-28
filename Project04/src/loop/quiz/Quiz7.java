package loop.quiz;


//  구구단을 3단부터 7단까지만 출력하세요

public class Quiz7 {

		public static void main(String[] args) {

			for(int dan = 3; dan <=7; dan++){ //초기화식을 3단으로 설정. 조건식은 7단으로 설정.
				
				for(int times = 1; times <=9; times++){ //곱하는수 1부터 9까지 총 9번 수행함
					System.out.println(dan + "X" + times + "=" + dan * times);
				}
				
				System.out.println();
			}
		}

}
