package sv.edu.model;

import javax.persistence.*;

@Entity
public class TiposDocumentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtipodocu;
	@Column
	private String documento;
	
	
	public int getIdtipodocu() {
		return idtipodocu;
	}
	public void setIdtipodocu(int idtipodocu) {
		this.idtipodocu = idtipodocu;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
}
