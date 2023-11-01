package inheritance;

public class Quiz5 {

	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.atack = 10;
		monster.health = 100;
		monster.showInfo();
		monster.doAttack();
		
		System.out.println();
		
		Slime slime = new Slime();
		slime.atack = 30;
		slime.health = 200;
		slime.skill = "마비";
		slime.showInfo();
		slime.doAttack();
		slime.doSkill();
	}

}

class Monster {
	int atack; //공격력
	int health; //체력
	
	public void doAttack() {
		System.out.println("몬스터가 " + atack + "만큼 공격했다!");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + atack + "이고 체력은 " + health + "이다." );
	}
}

class Slime extends Monster { //Slime클래스는 Monster클래스를 상속받음
	String skill;
	
	public void doSkill() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
	}

}
