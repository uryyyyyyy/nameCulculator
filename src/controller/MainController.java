package controller;

import services.spec.NameCaluculateService;

import com.google.inject.Inject;

public class MainController {

	private static final String FILE_NAME = "names.txt";
	
	private final NameCaluculateService service;

	@Inject
	public MainController(NameCaluculateService service) {
		this.service = service;
	}

	public void execute() {
		System.out.println("Start");
		service.calcNames(FILE_NAME);
		System.out.println("Done");
	}
}
