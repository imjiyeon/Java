package array;

/*
 * 객체 배열 만들기
 * */
public class Ex6 {

	public static void main(String[] args) {

		Book[] library = new Book[5]; //책 5원을 저장할 배열 생성

		for (int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " "); //자료형이 객체이면 요소는 null로 초기화됨
		}
		System.out.println();
		
//		library[0].showBookInfo(); //참조변수의 값이 null인 상태로 사용하면 에러남

		// Book 인스턴스 5개를 생성하여 저장
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");

		// 배열의 모든 요소의 정보를 출력
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		// 각 배열요소가 가지고 있는 인스턴스 주소 출력
		for (int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " ");
		}

	}
}

class Book {

	private String bookName; //제목
	private String author; //저자

	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo(){
		System.out.println(bookName + "," + author);
	}
}

