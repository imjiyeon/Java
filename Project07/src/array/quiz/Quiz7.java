package array.quiz;

/*
 * System.arraycopy 메소드를 사용하여 배열을 복사해서 새로운 배열을 만드세요
 * 원본배열: {'a', 'b', 'c', 'd', 'e'}
 * 새배열: {'d', 'e'}
 * */
public class Quiz7 {

	public static void main(String[] args) {
		char[] srcArr = {'a' ,'b', 'c', 'd', 'e'}; //원본배열
		char[] destArr = new char[2]; //새배열
		
		System.arraycopy(srcArr, 3, destArr, 0, 2);
				
		for(int i=0; i<destArr.length; i++){
			System.out.print(destArr[i] + " ");
		}
	}
}
