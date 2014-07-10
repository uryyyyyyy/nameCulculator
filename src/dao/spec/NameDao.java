package dao.spec;

import java.io.IOException;
import java.util.List;

import dto.NameWithValue;

public interface NameDao {

	public List<String> getNames(String fileName) throws IOException;

	void save(List<NameWithValue> results, String fileName) throws IOException;

}
