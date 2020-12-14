package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.AuthorityDaoAPI;
import sv.edu.loginSecurity.entity.Authority;
import sv.edu.services.api.AuthorityServiceAPI;

@Service
public class AuthorityServiceImpl extends GenericServiceImpl<Authority, Long> implements AuthorityServiceAPI {

	@Autowired
	private AuthorityDaoAPI auth;
	
	@Override
	public CrudRepository<Authority, Long> getDao() {
		return auth;
	}

}
