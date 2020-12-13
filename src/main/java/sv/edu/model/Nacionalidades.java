package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nacionalidades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idnacionalidad;
	@Column
	private String nacionalidad;
	
	
	public int getIdnacionalidad() {
		return idnacionalidad;
	}
	public void setIdnacionalidad(int idnacionalidad) {
		this.idnacionalidad = idnacionalidad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
