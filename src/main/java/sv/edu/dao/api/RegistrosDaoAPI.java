package sv.edu.dao.api;

import org.springframework.data.repository.CrudRepository;

import sv.edu.model.Registros;

public interface RegistrosDaoAPI extends CrudRepository<Registros, String> {

}
