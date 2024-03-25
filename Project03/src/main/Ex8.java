package main;

/*
 * 삼항연산자
 * */
public class Ex8 {

	public static void main(String[] args) {
		
		// 삼항연산자를 사용해서 부모님의 나이 비교하기
		int motherAge = 47;
		int fatherAge = 50;

		// 아빠의 나이가 더 많기때문에 두번째 결과를 반환한다
		String str = (motherAge > fatherAge) ? "엄마" : "아빠";
		System.out.println(str);

		char ch = (motherAge > fatherAge) ? 'm' : 'f';
		System.out.println(ch);

		int i = (motherAge > fatherAge) ? 1 : 2;
		System.out.println(i);

		boolean bool = (motherAge > fatherAge) ? true : false;
		System.out.println(bool);

	}
}
