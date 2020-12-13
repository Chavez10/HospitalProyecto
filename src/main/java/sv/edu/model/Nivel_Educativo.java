package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nivel_Educativo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_nivel;
	@Column
	private String nivel;

	public int getId_nivel() {
		return id_nivel;
	}

	
	public void setId_nivel(int id_nivel) {
		this.id_nivel = id_nivel;
	}

	
	public String getNivel() {
		return nivel;
	}

	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
