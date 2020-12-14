package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.AuthoritiesUsersDaoAPI;
import sv.edu.model.AuthoritiesUsers;
import sv.edu.services.api.AuthoritiesUsersServiceAPI;

@Service
public class AuthoritiesUsersServiceImpl  extends GenericServiceImpl<AuthoritiesUsers, Long> implements AuthoritiesUsersServiceAPI {

	@Autowired
	private AuthoritiesUsersDaoAPI authUserAPI;
	
	@Override
	public CrudRepository<AuthoritiesUsers, Long> getDao() {
		return authUserAPI;
	}

}
