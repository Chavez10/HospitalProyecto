package sv.edu.service.impl;

import sv.edu.services.api.RolesServiceAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.RolesDaoAPI;
import sv.edu.model.Roles;

@Service
public class RolesServiceImpl extends GenericServiceImpl<Roles, Integer> implements RolesServiceAPI {
	
	@Autowired
	private RolesDaoAPI rolesDaoAPI;
	
	@Override
	public CrudRepository<Roles, Integer> getDao() {
		return rolesDaoAPI;
	}


	
}
