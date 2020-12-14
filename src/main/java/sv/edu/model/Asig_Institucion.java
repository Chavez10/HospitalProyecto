package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asig_Institucion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_asig_institucion;
	@Column
	private String id_registro;
	@Column
	private Integer id_institucion;
	@Column
	private Integer id_nivel;
	
	public Integer getId_asig_institucion() {
		return id_asig_institucion;
	}
	public void setId_asig_institucion(Integer id_asig_institucion) {
		this.id_asig_institucion = id_asig_institucion;
	}
	
	public String getId_registro() {
		return id_registro;
	}
	public void setId_registro(String id_registro) {
		this.id_registro = id_registro;
	}
	public Integer getId_institucion() {
		return id_institucion;
	}
	public void setId_institucion(Integer id_institucion) {
		this.id_institucion = id_institucion;
	}
	public Integer getId_nivel() {
		return id_nivel;
	}
	public void setId_nivel(Integer id_nivel) {
		this.id_nivel = id_nivel;
	}
	
	

}
