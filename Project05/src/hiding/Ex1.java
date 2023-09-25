package hiding;

/*
 * private 변수와 get/set 함수 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		Person person = new Person();
//		person.name = "둘리"; //에러발생 -> private 변수는 외부에서 사용할 수 없다
		
		person.setName("둘리"); //public 메소드를 이용해서 멤버변수를 간접적으로 사용할 수 있다
		person.getName();
	}
}   


class Person {
	private String name; //private 접근제한자 사용
	private int height;
	private double weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}   
