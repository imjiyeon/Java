package inheritance;


//  아래 그림은 몬스터과 슬라임 클래스의 상속관계를 표현한 것입니다.
//  다음과 같이 클래스를 구현하고, 객체를 생성하세요.

public class Quiz4 {

	public static void main(String[] args) {
		Monster monster = new Monster(); // 몬스터 생성
		monster.atack = 10;
		monster.health = 100;
		monster.showInfo();
		monster.doAttack();
		System.out.println();

		Slime slime = new Slime(); // 슬라임 생성
		slime.atack = 30; // 부모클래스에서 물려받은 속성
		slime.health = 200; // 부모클래스에서 물려받은 속성
		slime.skill = "마비";
		slime.showInfo(); // 부모클래스에서 물려받은 기능
		slime.doAttack(); // 부모클래스에서 물려받은 기능
		slime.doSkill();
	}

}

// 몬스터 클래스
class Monster {
	int atack; // 공격력
	int health; // 체력

	public void doAttack() {
		System.out.println("몬스터가 " + atack + "만큼 공격했다!");
	}

	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + atack + "이고 체력은 " + health + "이다.");
	}
}

//슬라임 클래스
class Slime extends Monster {
	String skill; // 스킬

	public void doSkill() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
	}

}
