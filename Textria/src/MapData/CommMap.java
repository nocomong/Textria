package MapData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import AllChrData.NewChr;

public class CommMap {
	
	Scanner scan = new Scanner(System.in);
	
	NewChr locPlayer = new NewChr();

	ArrayList mapList = new ArrayList<String>();
	
		public CommMap(){
			mapList.add("산들바람 마을");
			mapList.add("산들바람 언덕");
			mapList.add("블랙버로우");
			mapList.add("에버프로스트 마운틴");
			mapList.add("퍼마프로스트");
	}



		public void enterMap() {
			System.out.println(mapList.get(locPlayer.getCurrentMapNum())+"에 입장합니다.");
		}
		
		public void infoMap() {
			ArrayList mapInfo = new ArrayList <String>();
			mapInfo.add("산들바람 마을\r\n기분좋은 바람이 불어오는 마을로 많은 모험가들이 북적이고 있다.\r\n주변지역 : 산들바람 언덕\r\n레벨분포 : 1~3");
			mapInfo.add("산들바람 언덕\r\n평범한 언덕 주변에 몇몇 고블린이 배회하고 있다.\r\n주변지역 : 산들바람 마을 , 블랙버로우\r\n레벨분포 : 2~5");
			mapInfo.add("블랙버로우\r\n북쪽으로 가기위한 유일한 동굴로 현재 놀들이 점령 중이다.\r\n주변지역 : 산들바람 언덕 , 에버프로스트 마운틴\r\n레벨분포 : 5~10");
			mapInfo.add("에버프로스트 마운틴\r\n하얀 눈이 산을 덮고 있는  웅장한 산맥\r\n주변지역 : 블랙버로우 , 퍼마프로스트\r\n레벨분포 : 8~15");
			mapInfo.add("퍼마프로스트\r\n얼음으로 뒤덮힌 동굴. 가장 깊은곳 어딘가에서 용의 숨결이 느껴진다.\r\n주변지역 : 에버프로스트 마운틴\r\n레벨분포 : 15~20");
			
			System.out.println(mapInfo.get(locPlayer.getCurrentMapNum()));
			
		}
	
		public void moveCheckMap() {
			
			try {
				
			System.out.println("아래의 지역으로 이동이 가능 합니다.");
			if(locPlayer.getCurrentMapNum()==0) {
				System.out.print("1.");
				System.out.println(mapList.get(locPlayer.getCurrentMapNum()+1));
			}else {
			System.out.print("1.");
			System.out.println(mapList.get(locPlayer.getCurrentMapNum()-1));
			System.out.print("2.");
			System.out.println(mapList.get(locPlayer.getCurrentMapNum()+1));
			}
			}catch(Exception e) {
				
			}
			
			
		}
		
		public void moveMap1() {
			try {
			if(locPlayer.getCurrentMapNum()==0) {
				locPlayer.setCurrentMapNum(1);
				enterMap();
			}else {
				locPlayer.setCurrentMapNum1(1);
				enterMap();
			}
			}catch(Exception e) {
				
			}
			
		}
		public void moveMap2() {
			try {
			if(locPlayer.getCurrentMapNum()==0) {
				System.out.println("올바른 지역을 선택하세요.");
			}else if(locPlayer.getCurrentMapNum()==mapList.size()-1) {
				System.out.println("더이상 이동할 수 없습니다.");
				
			}else {
			locPlayer.setCurrentMapNum2(2);
			enterMap();
			}
			}catch(Exception e) {
				
			}
		}
		
	


} //CommMap 클래스 끝
