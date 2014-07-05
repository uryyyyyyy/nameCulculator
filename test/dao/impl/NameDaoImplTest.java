package dao.impl;

import static org.hamcrest.CoreMatchers.theInstance;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mock;

import com.google.inject.Guice;
import com.google.inject.Injector;

import dao.impl.NameDaoImpl;
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
	public void test2() {
		NameDao mockDao = mock(NameDao.class);
		when(mockDao.getNames()).thenReturn(new ArrayList<String>());
		fail("Not yet implemented");
	}

}
