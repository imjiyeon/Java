package loop.quiz;

/*
 * 구구단을 3단부터 7단까지만 출력하세요
 * */

public class Quiz5 {

		public static void main(String[] args) {

			for(int dan = 3; dan <=7; dan++){ //단이 3부터 7까지 참이므로 총 5번 반복한다. 
				for(int times = 1; times <=9; times++){ //곱하는수가 1부터 9까지 참이므로 총 9번 반복한다. 
					System.out.println(dan + "X" + times + "=" + dan * times);
				}
				System.out.println();
			}
		}

}
