package dao.impl;

import static org.junit.Assert.fail;

import org.junit.Test;

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

}
