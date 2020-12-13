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
	private Integer id_nacionalidad;
	@Column
	private String nacionalidad;
	
	
	public Integer getId_nacionalidad() {
		return id_nacionalidad;
	}
	public void setId_nacionalidad(Integer id_nacionalidad) {
		this.id_nacionalidad = id_nacionalidad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
