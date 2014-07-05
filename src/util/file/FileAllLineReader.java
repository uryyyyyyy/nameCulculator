package util.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileAllLineReader {

	private FileAllLineReader(){

	}

	public static List<String> readAllLine(String fileName) {
		BufferedReader br=null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			List<String> strList = new ArrayList<>();
			String str = br.readLine();
			while(str != null){
				strList.add(str);
				str = br.readLine();
			}
			br.close();
			return strList;
		} catch (IOException e) {
			e.printStackTrace();
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return null;
		}
	}
}
