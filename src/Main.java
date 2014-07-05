import com.google.inject.Guice;
import com.google.inject.Injector;

import controller.MainController;
import di.DiModule;


public class Main {

	public static void main(String[] args){
		Injector injector = Guice.createInjector(new DiModule());
		MainController c = injector.getInstance(MainController.class);
		c.execute();
	}
}
