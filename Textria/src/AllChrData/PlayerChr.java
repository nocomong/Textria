package AllChrData;

import java.util.ArrayList;

public class PlayerChr extends CommChr {
	
		private int maxExp; //최대경험치
		private int currentExp; //현재 경험치	
		
		
		
		private String skill_1; //1번 스킬 슬롯
		private String skill_2; //2번 스킬 슬롯
		private String skill_3; //3번 스킬 슬롯
		
		private String equip_1; //무기
		private String equip_2; //갑옷
		private String equip_3; // 반지
		
		public int getMaxExp() {
			return maxExp;
		}

		public void setMaxExp(int maxExp) {
			this.maxExp = maxExp;
		}

		public int getCurrentExp() {
			return currentExp;
		}

		public void setCurrentExp(int currentExp) {
			this.currentExp = currentExp;
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
		
		public String getEquip_1() {
			return equip_1;
		}

		public void setEquip_1(String equip_1) {
			this.equip_1 = equip_1;
		}

		public String getEquip_2() {
			return equip_2;
		}

		public void setEquip_2(String equip_2) {
			this.equip_2 = equip_2;
		}

		public String getEquip_3() {
			return equip_3;
		}

		public void setEquip_3(String equip_3) {
			this.equip_3 = equip_3;
		}
		
		// 캐릭터 경험치 메소드
		public void callExp() {
			
			ArrayList<Integer> createExp = new ArrayList<Integer>();
			
			for(int i=0 ; i < MAX_LEVEL+1 ; i++) {
				
				createExp.add(i,(i+20)*i*15);
				
				}
			
		try {
				
			maxExp = createExp.get(super.getLevel());
			System.out.println("경험치 ( "+currentExp+" / "+maxExp+" )");
		}catch(Exception e) {}
			
		}

		// 캐릭터 정보 오버라이딩
		public void chrPrintAll() {
			
			System.out.println("캐릭터 명 : "+ name);
			System.out.println("레벨 : "+ level);
			callExp();// 캐릭터 경험치 메소드 호출
		
			callHealth(); // 캐릭터 생명력 메소드 호출
			
			System.out.println("힘 : "+ str);
			System.out.println("체력 : "+ sta);
			System.out.println("손재주 : "+ dex);
			System.out.println("민첩 : "+ agi);
			System.out.println("지능 : "+ intelligence);
			System.out.println("지혜 : "+ wis);
			
			System.out.println("공격력 : "+ attackPoint);
			System.out.println("방어력 : "+ shildPoint);
			System.out.println("치명타 : "+ criticalPoint+ "%");
			System.out.println("회피율 : "+ evadePoint+ "%");
		
			System.out.println("스킬 1 : "+ skill_1 );
			System.out.println("스킬 2 : "+ skill_2);
			System.out.println("스킬 3 : "+ skill_3);
			
			System.out.println("장비 1 : "+ equip_1);
			System.out.println("장비 2 : "+ equip_2);
			System.out.println("장비 3 : "+ equip_3);
		}
		
		
		
		
	} //PlayerChr 클래스 끝
	


