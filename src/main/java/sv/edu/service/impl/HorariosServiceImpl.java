package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.HorariosDaoAPI;
import sv.edu.dao.api.RolesDaoAPI;
import sv.edu.model.Horarios;
import sv.edu.model.Roles;
import sv.edu.services.api.HorariosServiceAPI;

@Service
public class HorariosServiceImpl extends GenericServiceImpl<Horarios, String> implements HorariosServiceAPI {
	@Autowired
	private HorariosDaoAPI horariosDaoAPI;

	@Override
	public CrudRepository<Horarios, String> getDao() {
		return horariosDaoAPI;

	}

}
