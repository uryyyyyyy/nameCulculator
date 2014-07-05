package util.file;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

public class FileAllListWriter {

	private FileAllListWriter(){

	}

	@SuppressWarnings("null")
	public static boolean writeAllList(String fileName, List<String> outputs) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName))));
			for(String str : outputs){
				pw.println(str);
			}
			pw.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			pw.close();
			return false;
		}
	}
}
