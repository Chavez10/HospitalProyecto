package sv.edu.dao.api;

import org.springframework.data.repository.CrudRepository;

import sv.edu.loginSecurity.entity.User;

public interface UserDaoAPI extends CrudRepository<User, Long> {
	
}
