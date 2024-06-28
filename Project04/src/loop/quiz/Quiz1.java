package loop.quiz;


//  반복문을 사용해서 11부터 20까지 출력하세요.

public class Quiz1 {

	public static void main(String[] args) {

		System.out.println(11);
		System.out.println(12);
		System.out.println(13);
		System.out.println(14);
		System.out.println(15);
		System.out.println(16);
		System.out.println(17);
		System.out.println(18);
		System.out.println(19);
		System.out.println(20);

		int num = 11; // 11로 시작
		while (num <= 20) { // num이 20이 될 때까지 총 10번 수행함
			System.out.println(num); // 11,12,13,14,15,16,17,18,19,20
			num++;
		}
	}
}
