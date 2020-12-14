package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horarios {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private String id_horario;
	@Column
	private String horario;

	
	public String getId_horario() {
		return id_horario;
	}
	
	public void setId_horario(String id_horario) {
		this.id_horario = id_horario;
	}
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
