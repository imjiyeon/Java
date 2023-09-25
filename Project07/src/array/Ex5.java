package array;

/*
 * System.arraycopy 메소드를 사용하여 배열을 복사하여 새로운 배열을 만든다
 * 원본배열 : {'a' ,'b', 'c', 'd', 'e'}
 * 새배열 : {'a' ,'b', 'c'}
 * */
public class Ex5 {

	public static void main(String[] args) {
		// abcde 목록을 가진 배열에서
		// abc만 추출하여 새로운 배열을 만들어보자

		char[] srcArr = {'a' ,'b', 'c', 'd', 'e'};
		char[] destArr = new char[3];
		
		System.arraycopy(srcArr, 0, destArr, 0, 3); //원본배열, 시작위치, 새배열, 시작위치, 개수
		
		System.out.println("원본배열:");
		for(int i=0; i<srcArr.length; i++){
			System.out.print(srcArr[i] + " ");
		}
		System.out.println();
		System.out.println("새배열:");
		for(int i=0; i<destArr.length; i++){
			System.out.print(destArr[i] + " ");
		}
		//원본배열의 0~2 배열요소를 새배열로 복사함
	}
}
