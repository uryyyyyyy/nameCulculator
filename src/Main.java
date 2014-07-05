import services.impl.ServiceModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import controller.MainController;


public class Main {
	
	public static void main(String[] args){
		 Injector injector = Guice.createInjector(new ServiceModule());
		 MainController c = injector.getInstance(MainController.class);
		    c.execute();
	}
}
