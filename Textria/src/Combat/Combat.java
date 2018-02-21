package Combat;

import AllChrData.MonsterList;
import AllChrData.NewChr;
import AllChrData.PlayerChr;

public class Combat {
	
	public Combat() {

	}
	
	public Combat(NewChr p, MonsterList m) {

	}

	public void pause() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CombatStart(){
		PlayerChr playerData = null;
		MonsterList monsterData = null;
		
		while(playerData.getCurrentHealth() >0 && monsterData.getCurrentHealth() > 0) {
			
			System.out.println(playerData.getName()+"이 "+monsterData.getName()+"을(를) 공격 합니다.");
			pause();
			System.out.print(playerData.getAttackPoint()+"피해를 주었습니다.");
			monsterData.setCurrentHealth((int) (monsterData.getCurrentHealth() - playerData.getAttackPoint()));
			pause();
			System.out.println(monsterData.getName()+"이 "+playerData.getName()+"을(를) 공격 합니다.");
			pause();
			System.out.print(monsterData.getAttackPoint()+"피해를 주었습니다.");
			playerData.setCurrentHealth((int) (playerData.getCurrentHealth() - monsterData.getAttackPoint()));
			pause();
			
		}
		
		
		
	}
	
}
