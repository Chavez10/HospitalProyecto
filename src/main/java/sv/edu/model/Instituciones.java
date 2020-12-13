package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instituciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_institucion;
@Column
	public int getId_institucion() {
		return id_institucion;
	}

	
	public void setId_institucion(int id_institucion) {
		this.id_institucion = id_institucion;
	}

	
	public String getInstitucion() {
		return institucion;
	}

	
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	
	private String institucion;

}
