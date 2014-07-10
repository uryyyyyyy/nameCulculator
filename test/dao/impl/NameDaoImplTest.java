package dao.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import dao.spec.NameDao;
import di.DiModule;

public class NameDaoImplTest {

	@Test
	public void test() {
		Injector injector = Guice.createInjector(new DiModule());
		NameDao c = injector.getInstance(NameDaoImpl.class);
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() throws IOException {
		NameDao mockDao = mock(NameDao.class);
		when(mockDao.getNames("names.txt")).thenReturn(new ArrayList<String>());
		fail("Not yet implemented");
	}
	
	@Test
	public void test3() throws IOException {
		NameDaoImpl daoImpl = new NameDaoImpl();
		List<String > strList = daoImpl.getNames("test_names.txt");
		assertThat(strList.get(0), is("MARY"));
		assertThat(strList.get(10), is("JENNIFER"));
		assertThat(strList.get(100), is("ALICE"));
		assertThat(strList.get(200), is("PEGGY"));
	}

}
