package daos.impl;

import java.util.List;

import daos.spec.NameDao;

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
