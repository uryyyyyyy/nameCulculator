package util.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dto.NameWithValue;

public class CharactorCaluculator {
	
	private CharactorCaluculator(){
		
	}

	public static List<NameWithValue> calcEachString(List<String> nameList,
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
			count += characterCountedMap.get(s);
		}
		return count;
	}

}
