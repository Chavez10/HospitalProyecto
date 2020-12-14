package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.DiasTuernosDaoAPI;
import sv.edu.model.Dias_Turnos;
import sv.edu.services.api.DiasTurnosServiceAPI;


@Service
public class DiasTurnosServiceImpl extends GenericServiceImpl<Dias_Turnos, Integer> implements DiasTurnosServiceAPI {
	
	@Autowired
	private DiasTuernosDaoAPI diasTuenosDaoAPI;

	@Override
	public CrudRepository<Dias_Turnos, Integer> getDao() {
		// TODO Auto-generated method stub
		return diasTuenosDaoAPI;
	}
	


}
