package sv.edu.dao.api;

import org.springframework.data.repository.CrudRepository;

import sv.edu.loginSecurity.entity.Authority;

public interface AuthorityDaoAPI extends CrudRepository<Authority, Long> {

}
