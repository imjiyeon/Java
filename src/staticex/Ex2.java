package staticex;

/*
 * serialNum 변수의 get(),set() 메소드 사용하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		Student2 student1 = new Student2(); 
		student1.studentName = "둘리";
		System.out.println(Student2.getSerialNum()); //serialNum를 가져오기 위해 get메소드를 클래스이름으로 직접 호출
		
		Student2 student2 = new Student2(); 
		student2.studentName = "도우너";
		System.out.println(Student2.getSerialNum());
	}
}

class Student2 {	
	private static int serialNum = 1000; //private 변수로 변경
	int studentID;
	String studentName;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	//serialNum변수의 set,get메소드 만들기 
	public static int getSerialNum() { //serialNum을 외부에서 사용하기위해 만듬
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum; //static메소드에서는 static변수와 지역변수만 사용 가능
		//Student2.studentName = "둘리"; //에러남. studentName은 인스턴스가 생성될 때 만들어지는 멤버변수이기때문에 사용할 수 없음
	}

}