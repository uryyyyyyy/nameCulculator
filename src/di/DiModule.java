package di;

import services.impl.NameCaluculateServiceImpl;
import services.spec.NameCaluculateService;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import daos.impl.NameDaoImpl;
import daos.spec.NameDao;

public class DiModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(NameDao.class).to(NameDaoImpl.class).in(Scopes.NO_SCOPE);
		bind(NameCaluculateService.class).to(NameCaluculateServiceImpl.class).in(Scopes.NO_SCOPE);
	}

}
