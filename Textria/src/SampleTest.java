import java.util.Scanner;

import AllChrData.MonsterList;
import AllChrData.NewChr;
import Command.Menu;
import MapData.CommMap;

public class SampleTest {

	public static void main(String[] args) {
		NewChr chr = new NewChr();
		Menu menu = new Menu();
		CommMap mapData = new CommMap();
		MonsterList mobList = new MonsterList();
		

		

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
			mobList.mobListSetMap0();
			mobList.mobListCall();
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
		
	


	}
	
	


}
