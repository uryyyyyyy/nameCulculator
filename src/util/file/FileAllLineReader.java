package util.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileAllLineReader {

	private FileAllLineReader(){

	}

	public static List<String> readAllLine(String fileName) {
		InputStream in;
		try {
			in = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
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
			return null;
		}
	}
}
