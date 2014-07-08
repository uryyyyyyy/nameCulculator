package util.character;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import dto.NameWithValue;

public class CharactorCaluculatorTest {

	@Test
	public void test() {
		List<String> list = new ArrayList<>();
		list.add("Str1");
		list.add("Str2");
		list.add("Str3");
		list.add("Str4");
		Map<Character, Integer> map = new HashMap<>();
		map.put('S', 4);
		map.put('t', 4);
		map.put('r', 4);
		map.put('1', 1);
		map.put('2', 1);
		map.put('3', 1);
		map.put('4', 1);
		List<NameWithValue> resultList = CharactorCaluculator.calcEachNameCount(list, map);
		
		assertThat(resultList.get(0).value, is(13L));
		assertThat(resultList.get(0).name, is("Str1"));
		assertThat(resultList.get(3).value, is(52L));
		assertThat(resultList.get(3).name, is("Str4"));
	}

}
