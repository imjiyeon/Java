package finalex;

/*
 * 여러 파일에서 공유하는 상수 만들기
 * */
public class Define {

	// public이라 외부에서 사용 가능하고, static이라 인스턴스 없이 사용 가능
	// 모든 파일에서 공유해야 하므로, 값이 바뀌지 않도록 final 변수로 선언
	public static final int MIN = 1; //최소값
	
	public static final int MAX = 999; //최대값
	
	public static final int ENG = 1001; //영어 과목 코드
	
	public static final int MATH = 2001; //수학 과목 코드
	
}
