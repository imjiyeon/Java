package staticex;

/*
 * static 변수의 getter(),setter() 메소드 만들기
 * */
public class Ex2 {

	public static void main(String[] args) {
		Student2 student1 = new Student2(); 
		student1.studentName = "둘리";
		System.out.println(Student2.getCount()); //count를 가져오기 위해 get메소드를 호출
		
		Student2 student2 = new Student2(); 
		student2.studentName = "도우너";
		System.out.println(Student2.getCount());
	}
}

class Student2 {	
	private static int count = 0; //private 변수로 변경
	int studentID;
	String studentName;
	
	public Student2() {
		count++;
		studentID = count;
	}
	
	//외부에서 값을 사용하기 위해 public 메소드 만들기 
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		Student2.count = count; //static메소드에서는 static변수와 지역변수만 사용 가능
		//studentName = "둘리"; //에러남. studentName은 인스턴스가 생성될 때 만들어지는 멤버변수이기때문에 사용할 수 없음
	}

}