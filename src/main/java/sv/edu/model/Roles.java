package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idrol;
	@Column
	private String rol;
	
	
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	

}
