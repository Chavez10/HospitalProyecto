package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dias_Turnos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_dia;
	@Column
	private String dia;

	
	public Integer getId_dia() {
		return id_dia;
	}


	public void setId_dia(Integer id_dia) {
		this.id_dia = id_dia;
	}

	
	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}
}
