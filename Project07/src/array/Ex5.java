package array;

/*
 * 배열 복사하기
 * 
 * abcde 목록을 가진 배열에서 "abc" 만 추출하여 새로운 배열로 만들기
 * 원본배열 : {'a' ,'b', 'c', 'd', 'e'}
 * 새배열 : {'a' ,'b', 'c'}
 * */
public class Ex5 {

	public static void main(String[] args) {

		// 배열을 복사하여 새로운 배열 만들기
		char[] srcArr = { 'a', 'b', 'c', 'd', 'e' }; // 원본배열
		char[] newArr = new char[3]; // 새로운배열

		// 배열 복사하기
		System.arraycopy(srcArr, 0, newArr, 0, 3); // 원본배열, 시작위치, 새배열, 시작위치, 개수

		System.out.print("원본배열: ");
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i] + " ");
		}
		System.out.println();
		System.out.print("새로운배열: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
