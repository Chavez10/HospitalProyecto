package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.Asig_EspecialidadDaoAPI;
import sv.edu.model.Asig_Especialidad;
import sv.edu.services.api.Asig_EspecialidadesServiceAPI;

@Service
public class Asig_EspecialidadesServiceIml extends GenericServiceImpl<Asig_Especialidad, Integer> implements Asig_EspecialidadesServiceAPI {

	@Autowired
	private Asig_EspecialidadDaoAPI asig_EspecialidadDaoAPI;
	@Override
	public CrudRepository<Asig_Especialidad, Integer> getDao() {
		// TODO Auto-generated method stub
		return asig_EspecialidadDaoAPI;
	}

	
	
}
