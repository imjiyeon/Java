package string;

/*
 * StringBuilder 클래스 사용하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		
		//String 문자열 클래스는 값을 변경하면 새로운 문자열이 생성됨
		String str = "java";
		System.out.println("str 문자열 주소: " + System.identityHashCode(str)); //인스턴스가 처음 생성되었을 때 메모리 주소
		str = str + " and"; //문자열 추가
		str = str + " android";
		System.out.println("연결된 string 문자열 주소: " + System.identityHashCode(str)); //새로운 문자열이 생성되면서 주소가 달라짐
		System.out.println(str); //따라서 String클래스로 값을 계속 변경하면 메모리가 많이 낭비됨
		System.out.println();

		StringBuilder buffer = new StringBuilder("java"); //StringBuilder 클래스로 문자열 생성
		System.out.println("buffer 문자열 주소: " + System.identityHashCode(buffer)); //인스턴스가 처음 생성되었을 때 메모리 주소
		buffer.append(" and"); //문자열 추가
		buffer.append(" android");
		System.out.println("연결된 buffer 문자열 주소: " + System.identityHashCode(buffer)); //하나의 메모리에 계속 문자열이 연결되어 주소가 같음
		System.out.println(buffer.toString()); //다시 문자열로 반환	

	}
}
