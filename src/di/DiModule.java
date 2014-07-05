package di;

import service.impl.NameCaluculateServiceImpl;
import service.spec.NameCaluculateService;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import dao.impl.NameDaoImpl;
import dao.spec.NameDao;

public class DiModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(NameDao.class).to(NameDaoImpl.class).in(Scopes.NO_SCOPE);
		bind(NameCaluculateService.class).to(NameCaluculateServiceImpl.class).in(Scopes.NO_SCOPE);
	}

}
