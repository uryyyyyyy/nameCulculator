package dao.impl;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dao.spec.NameDao;
import dto.NameWithValue;

//scope狭くできないかな？
public class NameDaoImpl implements NameDao{

	//privateだとGuiceが認識しない。
	NameDaoImpl() {
		System.out.println("NameDaoImpl injected");
	}

	@Override
	public List<String> getNames(String fileName) throws IOException {
		List<String> strList = Files.readAllLines(Paths.get(fileName), Charset.forName("UTF-8"));
		return toNameList(strList);
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
	public void save(List<NameWithValue> results, String fileName) throws IOException {
		List<String> outputs= new ArrayList<>(results.size());
		for(NameWithValue dto : results){
			outputs.add(dto.name + " " + dto.value);
		}
		Files.write(Paths.get(fileName), outputs, Charset.forName("UTF-8"));
	}
}
