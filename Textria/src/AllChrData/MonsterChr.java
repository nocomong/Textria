package AllChrData;

public class MonsterChr extends CommChr {
	
	int dropExp; //처치시 플레이어가 획득 하는 경험치
	
	
	
	protected String skill_1; //1번 스킬 슬롯
	protected String skill_2; //2번 스킬 슬롯
	protected String skill_3; //3번 스킬 슬롯
	
	String dropItem1; //처치시 획득하는 아이템 리스트
	String dropItem2;
	String dropItem3;
	
	// getter&setter
	
	public int getDropExp() {
		return dropExp;
	}
	public void setDropExp(int dropExp) {
		this.dropExp = dropExp;
	}
	public String getSkill_1() {
		return skill_1;
	}
	public void setSkill_1(String skill_1) {
		this.skill_1 = skill_1;
	}
	public String getSkill_2() {
		return skill_2;
	}
	public void setSkill_2(String skill_2) {
		this.skill_2 = skill_2;
	}
	public String getSkill_3() {
		return skill_3;
	}
	public void setSkill_3(String skill_3) {
		this.skill_3 = skill_3;
	}
	public String getDropItem1() {
		return dropItem1;
	}
	public void setDropItem1(String dropItem1) {
		this.dropItem1 = dropItem1;
	}
	public String getDropItem2() {
		return dropItem2;
	}
	public void setDropItem2(String dropItem2) {
		this.dropItem2 = dropItem2;
	}
	public String getDropItem3() {
		return dropItem3;
	}
	public void setDropItem3(String dropItem3) {
		this.dropItem3 = dropItem3;
	}
	
	// 메소드 영역///////////////////////////
	
	
	
	
	public void chrPrintAll() {
		
		System.out.println("캐릭터 명 : "+ name);
		System.out.println("레벨 : "+ level);
	
		callHealth(); // 캐릭터 생명력 메소드 호출

		
		System.out.println("공격력 : "+ attackPoint);
		System.out.println("방어력 : "+ shildPoint);
		System.out.println("치명타 : "+ criticalPoint+ "%");
		System.out.println("회피율 : "+ evadePoint+ "%");
		
		System.out.println("처치시 획득 경험치 : "+dropExp);
		System.out.println("드롭 아이템1 : "+ dropItem1);
		System.out.println("드롭 아이템1 : "+ dropItem2);
		System.out.println("드롭 아이템1 : "+ dropItem3);
		
		

		
	}
	
	
	

}
