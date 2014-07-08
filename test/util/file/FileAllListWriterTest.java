package util.file;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FileAllListWriterTest {

	@Test
	public void test() {
		List<String> list = new ArrayList<>();
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		assertThat(FileAllListWriter.writeAllList("testFile.txt", list), is(true));
	}

}
