package sv.edu.dao.api;

import org.springframework.data.repository.CrudRepository;

import sv.edu.model.AuthoritiesUsers;

public interface AuthoritiesUsersDaoAPI extends CrudRepository<AuthoritiesUsers, Long> {

}
