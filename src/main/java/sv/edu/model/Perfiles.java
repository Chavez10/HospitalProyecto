package sv.edu.model;

import javax.persistence.*;

@Entity
public class Perfiles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int idperfil;
	@Column
	private String perfil;
	
	public int getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(int idperfil) {
		this.idperfil = idperfil;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
	

}
