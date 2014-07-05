package dao.spec;

import java.util.List;

import dto.NameWithValue;

public interface NameDao {

	public List<String> getNames(String fileName);

	void save(List<NameWithValue> results, String fileName);

}
