package stream.quiz;

public class TravelCustomer {

	private String name;   //이름
	private int age;       //나이
	private int budget;     //여행비용
	
	public TravelCustomer(String name, int age, int budget) {
		this.name = name;
		this.age = age;
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getBudget() {
		return budget;
	}
	
	public String toString() {
		return "name: " + name + "age: " + age + "budget: " + budget; 
	}
}
