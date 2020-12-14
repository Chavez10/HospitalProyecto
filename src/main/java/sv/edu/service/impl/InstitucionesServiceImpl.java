package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.InstitucionesDaoAPI;
import sv.edu.model.Instituciones;
import sv.edu.services.api.InstitucionesServiceAPI;


@Service
public class InstitucionesServiceImpl extends GenericServiceImpl <Instituciones, Integer>
		implements InstitucionesServiceAPI {

	@Autowired
	private InstitucionesDaoAPI institucionesDaoAPI;

	@Override
	public CrudRepository <Instituciones, Integer> getDao() {
		return institucionesDaoAPI;
	}
}
