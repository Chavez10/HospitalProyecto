package sv.edu.dao.api;

import org.springframework.data.repository.CrudRepository;

import sv.edu.model.Roles;

public interface RolesDaoAPI extends CrudRepository<Roles, Integer> {

}
