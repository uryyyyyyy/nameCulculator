package service.impl;

import java.util.List;

import service.spec.NameCaluculateService;

import com.google.inject.Inject;

import dao.spec.NameDao;

public class NameCaluculateServiceImpl implements NameCaluculateService {
	 
	 private final NameDao dao;

	 @Inject
	 NameCaluculateServiceImpl(NameDao dao){
		 System.out.println("NameCaluculateServiceImpl injected");
		 this.dao = dao;
	 }
	@Override
	public void calcNames(String fileName) {
		System.out.println("Service");
		List<String> nameList = dao.getNames("names.txt");
		return;
	}
}