package util.file;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

public class FileAllListWriter {

	private FileAllListWriter(){

	}

	public static boolean writeAllList(String fileName, List<String> outputs) {
		OutputStream out;
		try {
			out = new FileOutputStream(fileName);
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)));
			for(String str : outputs){
				pw.println(str);
			}
			pw.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}
}
