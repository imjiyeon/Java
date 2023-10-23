package instance;

/* 
 * 학생클래스 정의하고, 인스턴스 생성하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		Student student = new Student(); //Student 객체 생성
		
		student.studentID = 1001; //객체의 멤버변수를 사용해서 학번 변경
		student.studentName = "둘리";
		student.grade = 2 ;
		student.address = "인천 연수구";
		
		System.out.println("학생의 모든 정보를 출력합니다.");
		System.out.println("studentID = " + student.studentID);
		System.out.println("studentName = " + student.studentName);	
		System.out.println("grade = " + student.grade);		
		System.out.println("address = " + student.address);	
		System.out.println("=================================");
		student.showStudentInfo(); //객체의 메소드를 사용해서 학생의 모든 정보 출력
		System.out.println("=================================");	
		System.out.println("객체의 주소는 " + student + " 입니다."); //참조 변수 값 출력 (인스턴스 주소)
		
	}
}

