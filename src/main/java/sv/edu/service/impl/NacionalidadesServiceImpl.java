package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.NacionalidadesDaoAPI;
import sv.edu.model.Nacionalidades;
import sv.edu.services.api.NacionalidadesServiceAPI;
@Service
public class NacionalidadesServiceImpl extends GenericServiceImpl<Nacionalidades, Integer>
		implements NacionalidadesServiceAPI {

	@Autowired
	private NacionalidadesDaoAPI nacion;
	
	@Override
	public CrudRepository<Nacionalidades, Integer> getDao() {
		return nacion;
	}

}
