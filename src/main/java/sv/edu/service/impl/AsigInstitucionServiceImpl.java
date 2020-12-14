package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.AsigInstitucionDaoAPI;
import sv.edu.model.Asig_Institucion;
import sv.edu.services.api.AsigInstitucionServiceAPI;

@Service
public class AsigInstitucionServiceImpl extends GenericServiceImpl<Asig_Institucion, Integer> 
	implements AsigInstitucionServiceAPI{

	@Autowired
	private AsigInstitucionDaoAPI asigInsAPI;
	
	@Override
	public CrudRepository<Asig_Institucion, Integer> getDao() {
		return asigInsAPI;
	}
	
	

}
