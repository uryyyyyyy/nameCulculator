package services.impl;

import static org.junit.Assert.fail;

import org.junit.Test;

import services.spec.NameCaluculateService;

import com.google.inject.Guice;
import com.google.inject.Injector;

import di.DiModule;

public class NameCaluculateServiceImplTest {

	@Test
	public void test() {
		Injector injector = Guice.createInjector(new DiModule());
		NameCaluculateService c = injector.getInstance(NameCaluculateServiceImpl.class);
		fail("Not yet implemented");
	}

}
