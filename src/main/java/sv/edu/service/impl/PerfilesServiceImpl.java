package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.PerfilesDaoAPI;
import sv.edu.model.Perfiles;
import sv.edu.services.api.PerfilesServiceAPI;
@Service
public class PerfilesServiceImpl extends GenericServiceImpl<Perfiles, Integer> implements PerfilesServiceAPI {

	@Autowired
	private PerfilesDaoAPI perfil;
	
	@Override
	public CrudRepository<Perfiles, Integer> getDao() {
		return perfil;
	}

}
