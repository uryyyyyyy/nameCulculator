package dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import lombok.Cleanup;
import dao.spec.NameDao;
import dto.NameWithValue;

public class NameDaoImpl implements NameDao{

	NameDaoImpl() {
		System.out.println("NameDaoImpl injected");
	}

	@Override
	public List<String> getNames(String fileName) {
		try{
			List<String> strList = readAllLine(fileName);
			return toNameList(strList);
		}catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	private List<String> readAllLine(String fileName) throws IOException {
		@Cleanup BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		List<String> strList = new ArrayList<>();
		String str = br.readLine();
		while(str != null){
			strList.add(str);
			str = br.readLine();
		}
		return strList;
	}

	private List<String> toNameList(List<String> strList) {
		List<String> nameList = new ArrayList<>();
		for(String str : strList){
			for(String s : str.split(",")){
				nameList.add(s.replace("\"", ""));
			}
		}
		return nameList;
	}

	@Override
	public void save(List<NameWithValue> results) {
		for(NameWithValue dto : results){
			System.out.println(dto.name + " " + dto.value);
		}
	}
}
