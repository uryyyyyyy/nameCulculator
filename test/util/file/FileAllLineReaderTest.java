package util.file;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FileAllLineReaderTest {

	@Test
	public void test() {
		List<String> list = FileAllLineReader.readAllLine("testFile.txt");
		assertThat(list.get(0), is("String1"));
		assertThat(list.get(1), is("String2"));
		assertThat(list.get(2), is("String3"));
		assertThat(list.get(3), is("String4"));
	}

}
