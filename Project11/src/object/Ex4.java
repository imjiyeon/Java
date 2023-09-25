package object;

class Book {
	int bookNumber;
	String bookTitle;

	public Book(int number, String title) {
		super();
		this.bookNumber = number;
		this.bookTitle = title;
	}

	//toString 오버라이드하기 (generate)
	//객체의정보를 반환하도록 재정의하기
//	@Override
//	public String toString() {
//		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
//	}

}

/*
 * Object의 toString메소드 사용하기
 * */
public class Ex4 {

	public static void main(String[] args) {

		Book book = new Book(200, "개미");

		//toString메소드 원형 호출
		System.out.println(book.toString()); // 객체의 주소를 출력
		System.out.println(book); // == book.toString()과 같음
		//toString메소드 재정의 후 다시 호출
		
		Book book2 = book;
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
		//두 참조변수는 같은 인스턴스를 바라보기 때문에 같은 주소가 출력된다
		//단, toString메소드는 내부적으로 주소를 16진수로 변환하기 때문에 다르게 보인다
	}
}
