package instance;

/*
 * 학생클래스의 인스턴스를 여러개 생성하기
 * */
public class StudentTest2 {

	public static void main(String[] args) {
	
		Student student1 = new Student(); //첫번째 학생 생성
		student1.studentID = 1111; //멤버 변수 사용
		student1.studentName = "홍길동"; 
		student1.grade = 2 ;
		student1.address = "인천";
		System.out.println("객체의 주소는 " + student1 + " 입니다.");
		student1.showStudentInfo();
		
		Student student2 = new Student(); //두번째 학생 생성
		student2.studentID = 2222;
		student2.studentName = "둘리"; 
		student2.grade = 3 ;
		student2.address = "서울";
		System.out.println("객체의 주소는 " + student2 + " 입니다.");
		student2.showStudentInfo();
		
		//인스턴스의 주소가 다른것을 확인 할 수 있다
		
	}
}

