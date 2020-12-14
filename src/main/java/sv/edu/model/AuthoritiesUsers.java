package sv.edu.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthoritiesUsers {
	
	@Id
	private Integer usuario_id;
	@Id
	private Integer authority_id;
	
	
	public Integer getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}
	public Integer getAuthority_id() {
		return authority_id;
	}
	public void setAuthority_id(Integer authority_id) {
		this.authority_id = authority_id;
	}
	
	
	
	
}
