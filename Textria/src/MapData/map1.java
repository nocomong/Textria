package MapData;

import java.util.HashMap;
import java.util.Scanner;

public class map1 extends CommMap {
	
	
	public void addMap1() {
		
		HashMap<Integer, String> map1001 = new HashMap<Integer, String>();
		map1001.put(101, "산들바람 마을");
		map1001.put(102, "기분좋은 바람이 불어오는 마을로 많은 모험가들이 북적이고 있다.");
		map1001.put(103, "주변지역 : 산들바람 언덕");
		map1001.put(104,  "레벨분포 : 0");
		
		HashMap map1 = new HashMap<>();
		map1.putAll(map1001);
		
		System.out.println(map1);
				
	}

}


