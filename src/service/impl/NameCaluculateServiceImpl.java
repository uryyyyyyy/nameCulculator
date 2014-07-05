package service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import service.spec.NameCaluculateService;
import util.character.CharactorCaluculator;
import util.character.CharactorCounter;

import com.google.inject.Inject;

import dao.spec.NameDao;
import dto.NameWithValue;

public class NameCaluculateServiceImpl implements NameCaluculateService {
	 
	 private final NameDao dao;

	 @Inject
	 NameCaluculateServiceImpl(NameDao dao){
		 System.out.println("NameCaluculateServiceImpl injected");
		 this.dao = dao;
	 }
	@Override
	public void calcNames(String fileName) {
		List<String> nameList = dao.getNames("names.txt");
		Map<Character, Integer> characterCountedMap = CharactorCounter.countEachCharacter(nameList);
		Collections.sort(nameList);
		List<NameWithValue> results= CharactorCaluculator.calcEachString(nameList, characterCountedMap);
		dao.save(results, "score.txt");
		return;
	}
}