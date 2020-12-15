package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.Asig_DocumentosDaoAPI;
import sv.edu.model.Asig_Documentos;
import sv.edu.services.api.Asig_DocumentosServiceAPI;


@Service
public class Asig_DocumentosServiceImpl extends GenericServiceImpl<Asig_Documentos, Integer> implements Asig_DocumentosServiceAPI {

	@Autowired
	private Asig_DocumentosDaoAPI asig_DocumentosDaoAPI;

	@Override
	public CrudRepository<Asig_Documentos, Integer> getDao() {
		// TODO Auto-generated method stub
		return asig_DocumentosDaoAPI;
	}
	
	
	



}
