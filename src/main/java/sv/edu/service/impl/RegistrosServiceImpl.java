package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.RegistrosDaoAPI;
import sv.edu.model.Registros;
import sv.edu.services.api.RegistrosServiceAPI;

@Service
public class RegistrosServiceImpl extends GenericServiceImpl<Registros, String> implements RegistrosServiceAPI {

	@Autowired
	private RegistrosDaoAPI regiAPI;
	
	@Override
	public CrudRepository<Registros, String> getDao() {
		return regiAPI;
	}

}
