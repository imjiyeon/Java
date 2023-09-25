package main;

/*
 * 삼항연산자
 * */
public class Ex8 {

	public static void main(String[] args) {
		// 삼항연산자를 사용해서 부모님의 나이 비교하기
		int motherAge = 47;
		int fatherAge = 50;

		String str;
		str = (motherAge > fatherAge) ? "엄마" : "아빠"; // 엄마의 나이가 더 많기때문에 첫번째 결과를 반환한다
		System.out.println(str);

		char ch = (motherAge > fatherAge) ? 'm' : 'f';
		System.out.println(ch);

		int i = (motherAge > fatherAge) ? 1 : 2;
		System.out.println(i);

		// 엄마의나이가 아빠보다 많으면 true를 반환 그렇지 않으면 false를 반환
		boolean bool = (motherAge > fatherAge) ? true : false;
		System.out.println(bool);

	}
}
