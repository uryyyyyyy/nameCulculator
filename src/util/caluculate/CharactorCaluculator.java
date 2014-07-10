package util.caluculate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dto.NameWithValue;

public class CharactorCaluculator {
	
	private CharactorCaluculator(){
		
	}

	private static List<NameWithValue> calcEachNameCount(List<String> nameList,
			Map<Character, Integer> characterCountedMap) {
		List<NameWithValue> list = new ArrayList<>(nameList.size());
		
		for(int index=0; index<nameList.size(); index++){
			String name = nameList.get(index);
			int count = count(characterCountedMap, name);
			list.add(new NameWithValue(count * (index+1), name));
		}
		return list;
	}

	private static int count(Map<Character, Integer> characterCountedMap,
			String name) {
		int count = 0;
		for(char s :name.toCharArray()){
			count += characterCountedMap.get(s); //assert notNull
		}
		return count;
	}
	
	public static List<NameWithValue> method(List<String> nameList) {
		Map<Character, Integer> characterCountedMap = countEachCharacter(nameList);
		Collections.sort(nameList);
		List<NameWithValue> results= calcEachNameCount(nameList, characterCountedMap);
		return results;
	}
	
	private static Map<Character, Integer> countEachCharacter(List<String> nameList) {
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
