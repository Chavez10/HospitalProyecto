package sv.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import sv.edu.commons.GenericServiceImpl;
import sv.edu.dao.api.TiposDocumentosDaoAPI;
import sv.edu.model.TiposDocumentos;
import sv.edu.services.api.TiposDocumentosServiceAPI;
@Service
public class TiposDocumentosServiceImpl extends GenericServiceImpl<TiposDocumentos, Integer>
		implements TiposDocumentosServiceAPI {
	@Autowired
	private TiposDocumentosDaoAPI tiposDocu;
	@Override
	public CrudRepository<TiposDocumentos, Integer> getDao() {
		
		return tiposDocu;
	}

	
}
