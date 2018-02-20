package AllChrData;

import java.util.Scanner;

public class NewChr extends PlayerChr{
	
	Scanner scan = new Scanner(System.in);
	
	public NewChr() {
		
	}
	
	public void addNewChr() {
		
		
		System.out.println("텍스트리아에 오신것을 환영 합니다.");
		System.out.print("캐릭터 명을 입력 하세요 : ");
		setName(scan.next());
		
		System.out.println("원하는 클래스 번호를 입력 하세요.");
		System.out.println("1. 워리어 , 2. 로그 , 3. 레인져");
		
		int selectClass = 0;
		selectClass = scan.nextInt();
		if(selectClass== 1) {
			NewSwordMan();
		}
		else if(selectClass == 2) {
			NewRogue();
		}else {
			NewRogue();
		}
		
		System.out.println("캐릭터 명 : "+ getName());
		System.out.println("클래스 : "+ getCurrentClass());
		
		
		
		
	}
	
	public void NewSwordMan() {
		
		setCurrentClass("워리어");
		setCurrentMapNum(0);
		setStr(20);
		setSta(20);
		setDex(8);
		setAgi(12);
		setIntelligence(5);
		setWis(5);

	}
	
public void NewRogue() {
		
		setCurrentClass("로그");
		setCurrentMapNum(0);
		setStr(12);
		setSta(10);
		setDex(20);
		setAgi(17);
		setIntelligence(12);
		setWis(4);

		
	}

public void NewArcher() {
	
	setCurrentClass("레인저");
	setCurrentMapNum(0);
	setStr(10);
	setSta(10);
	setDex(17);
	setAgi(20);
	setIntelligence(10);
	setWis(8);

	
}

public void chrPrint() {
	
	System.out.println("캐릭터 명 : "+ name);
	System.out.println("클래스 : "+ currentClass);
	System.out.println("레벨 : "+ level);

	callHealth(); // 캐릭터 생명력 메소드 호출
	
	System.out.println("힘 : "+ str);
	System.out.println("체력 : "+ sta);
	System.out.println("손재주 : "+ dex);
	System.out.println("민첩 : "+ agi);
	System.out.println("지능 : "+ intelligence);
	System.out.println("지혜 : "+ wis);
	chrAttackPoint();
	chrShildPoint();
	chrCriticalPoint();
	chrEvadePoint();
	System.out.println("공격력 : "+ attackPoint);
	System.out.println("방어력 : "+ shildPoint);
	System.out.println("치명타 : "+ criticalPoint+ "%");
	System.out.println("회피율 : "+ evadePoint+ "%");
	
}
	

}
