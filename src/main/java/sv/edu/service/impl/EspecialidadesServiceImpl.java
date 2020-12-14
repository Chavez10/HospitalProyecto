package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.EspecialidadesDaoAPI;
import sv.edu.model.Especialidades;
import sv.edu.services.api.EspecialidadesServiceAPI;



@Service
public class EspecialidadesServiceImpl extends  GenericServiceImpl<Especialidades, Integer> implements EspecialidadesServiceAPI {
 
	@Autowired
 private EspecialidadesDaoAPI especialidadesDaoAPI;

	
	@Override
	public CrudRepository <Especialidades, Integer> getDao() {
		return especialidadesDaoAPI;
	}
}
