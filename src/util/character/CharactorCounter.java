package util.character;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharactorCounter {
	
	private CharactorCounter(){
		
	}
	
	public static Map<Character, Integer> countEachCharacter(List<String> nameList) {
		Map<Character, Integer> map = new HashMap<>();
		for(String name : nameList){
			for(Character s : name.toCharArray()){
				countCharacter(map, s);
			}
		}
		return map;
	}
	private static void countCharacter(Map<Character, Integer> map, Character s) {
		Integer value = map.get(s);
		if(value == null){
			map.put(s, 1);
		}else{
		map.put(s, ++value);
		}
	}

}
