package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asig_Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_asig_especialidad;
	@Column
	private String id_registro;
	@Column
	private String id_especialidad;
	public Integer getId_asig_especialidad() {
		return id_asig_especialidad;
	}
	public void setId_asig_especialidad(Integer id_asig_especialidad) {
		this.id_asig_especialidad = id_asig_especialidad;
	}
	public String getId_registro() {
		return id_registro;
	}
	public void setId_registro(String id_registro) {
		this.id_registro = id_registro;
	}
	public String getId_especialidad() {
		return id_especialidad;
	}
	public void setId_especialidad(String id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

}
