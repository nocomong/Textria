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
		System.out.println("1. 워리어 , 2. 레인져");
		
		int selectClass = 0;
		selectClass = scan.nextInt();
		if(selectClass== 1) {
			NewSwordMan();
		}
		else if(selectClass == 2) {
			NewArcher();
		}
		
		System.out.println("캐릭터 명 : "+ getName());
		System.out.println("클래스 : "+ getCurrentClass());
		
		
		
		
	}
	
	public void NewSwordMan() {
		
		setCurrentClass("워리어");
		setCurrentMapNum(0);
				
		setMaxHealth(200);
		setAttackPoint(50);
		setShildPoint(70);
		setCriticalPoint(3);
		setEvadePoint(2);
		setAttackSpeed(25);
		
		
		
		

	}
	
public void NewArcher() {
		
		setCurrentClass("레인져");
		setCurrentMapNum(0);

		setMaxHealth(120);
		setAttackPoint(110);
		setShildPoint(20);
		setCriticalPoint(7);
		setEvadePoint(5);
		setAttackSpeed(35);

		
	}



	


public void chrPrint() {
	
	System.out.println("캐릭터 명 : "+ name);
	System.out.println("클래스 : "+ currentClass);
	System.out.println("레벨 : "+ level);

	callHealth(); // 캐릭터 생명력 메소드 호출
	

	chrAttackPoint();
	chrShildPoint();
	chrCriticalPoint();
	chrEvadePoint();
	System.out.println("공격력 : "+ attackPoint);
	System.out.println("방어력 : "+ shildPoint);
	System.out.println("치명타 : "+ criticalPoint+ "%");
	System.out.println("회피율 : "+ evadePoint+ "%");
	System.out.println("공격속도: " + attackSpeed);
	
}
	

}
