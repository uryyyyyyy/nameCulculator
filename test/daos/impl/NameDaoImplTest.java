package daos.impl;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import daos.spec.NameDao;
import di.DiModule;

public class NameDaoImplTest {

	@Test
	public void test() {
		Injector injector = Guice.createInjector(new DiModule());
		NameDao c = injector.getInstance(NameDaoImpl.class);
		fail("Not yet implemented");
	}

}
