package dao.impl;

import java.util.List;

import dao.spec.NameDao;

public class NameDaoImpl implements NameDao{

	NameDaoImpl() {
		System.out.println("NameDaoImpl injected");
	}
	
	@Override
	public List<String> getNames() {
		System.out.println("Dao");
		return null;
	}

}
