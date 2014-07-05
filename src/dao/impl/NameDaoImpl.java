package dao.impl;

import java.util.ArrayList;
import java.util.List;

import util.file.FileAllLineReader;
import util.file.FileAllListWriter;
import dao.spec.NameDao;
import dto.NameWithValue;

//scope狭くできないかな？
public class NameDaoImpl implements NameDao{

	//privateだとGuiceが認識しない。
	NameDaoImpl() {
		System.out.println("NameDaoImpl injected");
	}

	@Override
	public List<String> getNames(String fileName) {
		List<String> strList = FileAllLineReader.readAllLine(fileName);
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
	public void save(List<NameWithValue> results, String fileName) {
		List<String> outputs= new ArrayList<>(results.size());
		for(NameWithValue dto : results){
			outputs.add(dto.name + " " + dto.value);
		}
		FileAllListWriter.writeAllList(fileName, outputs);
	}
}
