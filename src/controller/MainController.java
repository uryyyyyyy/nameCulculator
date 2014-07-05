package controller;

import services.ServiceFactory;
import services.ServiceFactoryImpl;
import services.spec.NameCaluculateService;

public class MainController {

	private static final String FILE_NAME = "names.txt";
	
	private final ServiceFactory serviceFactory;

	public MainController() {
		this.serviceFactory = new ServiceFactoryImpl();
	}

	public void execute() {
		System.out.println("Start");
		NameCaluculateService service = serviceFactory.getNameCaluculateService();
		service.calcNames(FILE_NAME);
		
		System.out.println("Done");
	}
}
