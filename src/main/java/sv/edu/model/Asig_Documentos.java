package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asig_Documentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_asig_docu;
	@Column
	private String asig_Documentosol;
	
	public Integer getId_asig_docu() {
		return id_asig_docu;
	}
	public void setId_asig_docu(Integer id_asig_docu) {
		this.id_asig_docu = id_asig_docu;
	}
	public String getAsig_Documentosol() {
		return asig_Documentosol;
	}
	public void setAsig_Documentosol(String asig_Documentosol) {
		this.asig_Documentosol = asig_Documentosol;
	}
	

}
