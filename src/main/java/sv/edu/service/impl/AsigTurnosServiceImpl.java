package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.AsigTurnosDaoAPI;
import sv.edu.model.AsigTurnos;
import sv.edu.services.api.AsigTurnosServiceAPI;

@Service
public class AsigTurnosServiceImpl extends GenericServiceImpl<AsigTurnos, Integer> implements AsigTurnosServiceAPI {

	@Autowired
	private AsigTurnosDaoAPI asigTurnosAPI;
	
	@Override
	public CrudRepository<AsigTurnos, Integer> getDao() {
		return asigTurnosAPI;
	}

}
