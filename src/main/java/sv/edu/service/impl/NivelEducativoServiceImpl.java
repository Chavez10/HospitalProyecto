package sv.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.NivelEducativoDaoAPI;

import sv.edu.model.Nivel_Educativo;

import sv.edu.services.api.NivelEducativoServiceAPI;

@Service
public class NivelEducativoServiceImpl  extends GenericServiceImpl<Nivel_Educativo, Integer> implements NivelEducativoServiceAPI {


	@Autowired
	private NivelEducativoDaoAPI nivelEducativoDaoAPI;

	@Override
	public CrudRepository<Nivel_Educativo, Integer> getDao() {
		// TODO Auto-generated method stub
		return nivelEducativoDaoAPI ;
	}
	

}
