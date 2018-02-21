package AllChrData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 유저, 몬스터 Super 클래스

public class CommChr {
	
//	필드선언
	
	protected String name; // 이름
	protected String currentClass; // 직업
	protected int level = 1; // 레벨
	final int MAX_LEVEL = 30;
	static int currentMapNum; //현재 맵번호
	
	protected int maxHealth; //최대 생명력
	protected int currentHealth; //현재 생명력

	
	protected int attackPoint; //공격력
	protected int shildPoint; //방어력
	protected int criticalPoint; //크리티컬 확률
	protected int evadePoint; //회피율
	protected int attackSpeed; //공격속도
	

	// 기본생성자
	public CommChr() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}




	public static int getCurrentMapNum() {
		return currentMapNum;
	}

	public static void setCurrentMapNum(int currentMapNum) {
		CommChr.currentMapNum = currentMapNum;
	}
	
	public static void setCurrentMapNum1(int currentMapNum) { //캐릭터 맵 넘버 1감소 세터
		CommChr.currentMapNum -= currentMapNum;
	}
	
	public static void setCurrentMapNum2(int currentMapNum) { //캐릭터 맵 넘버 1증가 세터
		CommChr.currentMapNum += currentMapNum-1;
	}
	

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public double getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public double getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int d) {
		this.currentHealth = d;
	}

	public double getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	public double getShildPoint() {
		return shildPoint;
	}

	public void setShildPoint(int shildPoint) {
		this.shildPoint = shildPoint;
	}

	public double getCriticalPoint() {
		return criticalPoint;
	}

	public void setCriticalPoint(int criticalPoint) {
		this.criticalPoint = criticalPoint;
	}

	public double getEvadePoint() {
		return evadePoint;
	}

	public void setEvadePoint(int evadePoint) {
		this.evadePoint = evadePoint;
	}


//	 메소드 영역 /////////////////////////////////////////////////////////////
	

	//캐릭터 생명력 메소드
	public void callHealth() {
		
//		maxHealth = (int)(level *10.37);
		currentHealth = (int)maxHealth;
		
		System.out.println("생명력 ( "+maxHealth+" / "+ currentHealth+" )");
		
	}
	
	//캐릭터 기본공격력 메소드
	public void chrAttackPoint() {
		
		setAttackPoint( (int)(getAttackPoint())*level);
				
	}
	//캐릭터 방어력 메소드
	public void chrShildPoint() {
		setShildPoint((int)getShildPoint()*level);
			
	}
	
	//캐릭터 크리티컬 확률 메소드
	public void chrCriticalPoint() {
		
				
	}
	
	//캐릭터 회피율 메소드
	public void chrEvadePoint() {

	}
	
	//캐릭터 정보 호출
	

	
	
	

}  //CommChr 클래스 끝
