package sv.edu.model;

import javax.persistence.*;

@Entity
public class Perfiles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id_perfil;
	@Column
	private String perfil;
	
	
	public Integer getId_perfil() {
		return id_perfil;
	}
	public void setId_perfil(Integer id_perfil) {
		this.id_perfil = id_perfil;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
	

}
