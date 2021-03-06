package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Especialidades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_especialidad;
	@Column
	private String especialidad;

	
	public Integer getId_especialidad() {
		return id_especialidad;
	}


	public void setId_especialidad(Integer id_especialidad) {
		this.id_especialidad = id_especialidad;
	}


	public String getEspecialidad() {
		return especialidad;
	}

	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
