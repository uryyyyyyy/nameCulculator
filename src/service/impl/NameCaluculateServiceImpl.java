package service.impl;

import java.io.IOException;
import java.util.List;

import service.spec.NameCaluculateService;
import util.caluculate.CharactorCaluculator;

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
		try{
			List<String> nameList = dao.getNames("names.txt");
			List<NameWithValue> results = CharactorCaluculator.method(nameList);
			dao.save(results, "score.txt");
		}catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException();
		}
		return;
	}
}