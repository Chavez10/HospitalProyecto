package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.AsigPerfilDaoAPI;
import sv.edu.model.Asig_Perfil;
import sv.edu.services.api.AsigPerfilServiceAPI;

@Service
public class AsigPerfilServiceImpl extends GenericServiceImpl<Asig_Perfil, Integer> implements AsigPerfilServiceAPI {

	@Autowired
	private AsigPerfilDaoAPI asigAPI;
	
	@Override
	public CrudRepository<Asig_Perfil, Integer> getDao() {
		return asigAPI;
	}

}
