package dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
		@Cleanup InputStream in = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
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
	public void save(List<NameWithValue> results, String fileName) {
		try {
			@Cleanup OutputStream out = new FileOutputStream(fileName);
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)));
			for(NameWithValue dto : results){
				pw.println(dto.name + " " + dto.value);
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
