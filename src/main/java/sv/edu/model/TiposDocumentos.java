package sv.edu.model;

import javax.persistence.*;

@Entity
public class TiposDocumentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipo_docu;
	@Column
	private String documento;
	
	
	
	public Integer getId_tipo_docu() {
		return id_tipo_docu;
	}
	public void setId_tipo_docu(Integer id_tipo_docu) {
		this.id_tipo_docu = id_tipo_docu;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
}
