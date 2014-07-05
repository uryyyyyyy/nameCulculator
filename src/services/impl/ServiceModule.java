package services.impl;

import services.spec.NameCaluculateService;

import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(NameCaluculateService.class).toInstance(new NameCaluculateServiceImpl());
	}

}
