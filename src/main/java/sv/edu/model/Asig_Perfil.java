package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asig_Perfil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_asig_perfil;
	@Column
	private String id_registro;
	@Column
	private Integer id_perfil;
	
	public Integer getId_asig_perfil() {
		return id_asig_perfil;
	}
	public void setId_asig_perfil(Integer id_asig_perfil) {
		this.id_asig_perfil = id_asig_perfil;
	}
	public String getId_registro() {
		return id_registro;
	}
	public void setId_registro(String id_registro) {
		this.id_registro = id_registro;
	}
	public Integer getId_perfil() {
		return id_perfil;
	}
	public void setId_perfil(Integer id_perfil) {
		this.id_perfil = id_perfil;
	}
	
	
}
