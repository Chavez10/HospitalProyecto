package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.UserDaoAPI;
import sv.edu.loginSecurity.entity.User;
import sv.edu.services.api.UserServiceAPI;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserServiceAPI {

	@Autowired
	private UserDaoAPI usu;
	
	@Override
	public CrudRepository<User, Long> getDao() {
		return usu;
	}
	
}
