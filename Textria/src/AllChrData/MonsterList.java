package AllChrData;

import java.util.ArrayList;
import java.util.Random;

public class MonsterList extends MonsterChr{

	ArrayList mobList = new ArrayList <String>();
	Random randomEngine = new Random();
	
	
	public MonsterList() {
		
		int attackSpeed; //공격속도
		
		int maxHealth; //최대 생명력
		int currentHealth; //현재 생명력

		
		int attackPoint; //기본 공격력
		int shildPoint; //방어력
		int criticalPoint; //크리티컬 확률
		int evadePoint; //회피율

		
	}
	
	public void mobListCall() {
		System.out.println("------------------------------");
		System.out.println("*몬스터 목록*");
		for(int i = 0 ; i <mobList.size() ; i++) {
			System.out.println(mobList.get(i));
		}
	}
	
	public void mobListSetMap0() {
		
		mobList.removeAll(mobList);
		
		MonsterChr rat = new MonsterChr();
		rat.name = "큰 쥐";
		rat.level = randomEngine.nextInt(2)+1;
		rat.attackPoint = 5;
		rat.attackSpeed = 5;
		rat.currentHealth = 100;
		rat.maxHealth = 100;
		rat.shildPoint = 10;
		rat.evadePoint = 10;
		rat.criticalPoint = 10;
		
		MonsterChr bat = new MonsterChr();
		bat.name = "큰 박쥐";
		bat.level = randomEngine.nextInt(2)+1;
		bat.attackPoint = 5;
		bat.attackSpeed = 5;
		bat.currentHealth = 100;
		bat.maxHealth = 100;
		bat.shildPoint = 10;
		bat.evadePoint = 10;
		bat.criticalPoint = 10;
		
		MonsterChr spider = new MonsterChr();
		spider.name = "큰 거미";
		spider.level = randomEngine.nextInt(2)+1;
		spider.attackPoint = 5;
		spider.attackSpeed = 5;
		spider.currentHealth = 100;
		spider.maxHealth = 100;
		spider.shildPoint = 10;
		spider.evadePoint = 10;
		spider.criticalPoint = 10;
		
		MonsterChr racoon = new MonsterChr();
		racoon.name = "너구리";
		racoon.level = randomEngine.nextInt(3)+1;
		racoon.attackPoint = 5;
		racoon.attackSpeed = 5;
		racoon.currentHealth = 100;
		racoon.maxHealth = 100;
		racoon.shildPoint = 10;
		racoon.evadePoint = 10;
		racoon.criticalPoint = 10;
		
		MonsterChr nollBaby = new MonsterChr();
		nollBaby.name = "어린 놀";
		nollBaby.level = randomEngine.nextInt(4)+1;
		nollBaby.attackPoint = 5;
		nollBaby.attackSpeed = 5;
		nollBaby.currentHealth = 100;
		nollBaby.maxHealth = 100;
		nollBaby.shildPoint = 10;
		nollBaby.evadePoint = 10;
		nollBaby.criticalPoint = 10;

		mobList.add(rat.name+"("+rat.level+"레벨)");
		mobList.add(bat.name+"("+bat.level+"레벨)");
		mobList.add(spider.name+"("+spider.level+"레벨)");
		mobList.add(racoon.name+"("+racoon.level+"레벨)");
		mobList.add(nollBaby.name+"("+nollBaby.level+"레벨)");

	
	}
	
}
