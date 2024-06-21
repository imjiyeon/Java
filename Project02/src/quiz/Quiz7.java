package quiz;

 
//  <형변환>
//  다음 코드를 보고 주석에 예상결과를 작성하세요.
//  값을 출력하지 말고 작성해보세요.
  
public class Quiz7 {
	public static void main(String[] args) {
		double d = 1.2;
		float f = 0.9f;

		int i = (int) d; //
		int i2 = (int) f; //
		int i3 = (int) d + (int) f; //
		int i4 = (int) (d + f); //

		System.out.println(i); // 소수점아래를 잃어서 1.2에서 1이됨
		System.out.println(i2); // 소수점아래를 잃어서 0.9에서 0이됨
		System.out.println(i3); // 두 실수가 각각 형변환되어 더해져서 1이됨
		System.out.println(i4); // 먼저 더해서 2.1이 되었고, 소수점아래를 잃어서 2가됨

	}
}
