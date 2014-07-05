package util.character;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

import util.character.CharactorCounter;

public class CharactorCounterTest {

	@Test
	public void test() {
		Map<Character, Integer> map = CharactorCounter.countEachCharacter(Arrays.asList("abba","asta","hoge","fuga"));
		
		assertThat(map.get('a'), is(5));
		assertThat(map.get('b'), is(2));
		assertThat(map.get('h'), is(1));
		assertThat(map.get('か'), nullValue());
		assertThat(map.get('A'), nullValue());
	}

}
