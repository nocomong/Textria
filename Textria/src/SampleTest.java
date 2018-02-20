import java.util.ArrayList;
import java.util.Scanner;

import AllChrData.NewChr;
import Command.Menu;
import MapData.CommMap;

public class SampleTest {

	public static void main(String[] args) {
		NewChr chr = new NewChr();
		Menu menu = new Menu();
		CommMap mapData = new CommMap();
		

		

	chr.addNewChr();
	System.out.println("------------------------------");
	try {
	mapData.enterMap();
	}catch(Exception e) {
		
	}

	System.out.println("'!메뉴'를 입력해 보세요.");
	
	while(true) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String command = scan.next();
		
		if(command.equals("!메뉴")){
			menu.printMenu();
		}
		
		if(command.equals("!내정보")){
			chr.chrPrint();
		}
		
		if(command.equals("!맵정보")) {
			mapData.infoMap();
		}
		
		if(command.equals("!주변지역")) {
			mapData.moveCheckMap();
						
		}
		if(command.equals("!이동1")) {
			mapData.moveMap1();
			
		}
		if(command.equals("!이동2")) {
			mapData.moveMap2();
			
		}

		
		System.out.println("------------------------------");
	}
		

		
		
//		
//		PlayerChr chr = new PlayerChr();
//		
//		chr.setLevel(1);
//		chr.setName("박진수");
//		chr.setStr(100);
//		chr.setSta(120);
//		chr.setDex(70);
//		chr.setAgi(80);
//		chr.setIntelligence(50);
//		chr.setWis(40);
//		
//		chr.chrAttackPoint();
//		chr.chrShildPoint();
//		chr.chrCriticalPoint();
//		chr.chrEvadePoint();
//		
//		
//		MonsterChr mob = new MonsterChr();
//		
//		mob.setName("오크");
//		mob.setLevel(1);
//		mob.setStr(80);
//		mob.setSta(90);
//		mob.setAgi(40);
//		mob.setDex(30);
//		mob.setIntelligence(10);
//		mob.setWis(9);
//		mob.setDropExp(20);
//		
//		mob.chrAttackPoint();
//		mob.chrShildPoint();
//		mob.chrCriticalPoint();
//		mob.chrEvadePoint();
//
//		
//		chr.chrPrintAll();
//		mob.chrPrintAll();

		
		


	}

}
