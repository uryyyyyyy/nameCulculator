package controller;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import di.DiModule;

public class MainControllerTest {

	@Test
	public void test() {
		Injector injector = Guice.createInjector(new DiModule());
		MainController c = injector.getInstance(MainController.class);
		fail("Not yet implemented");
	}

}
