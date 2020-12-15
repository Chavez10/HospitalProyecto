package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asig_Documentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_asig_docu;
	@Column
	private String id_registro;
	@Column
	private Integer tipo_docu;
	@Column
	private String numero_docu;
	public Integer getId_asig_docu() {
		return id_asig_docu;
	}
	public void setId_asig_docu(Integer id_asig_docu) {
		this.id_asig_docu = id_asig_docu;
	}
	public String getId_registro() {
		return id_registro;
	}
	public void setId_registro(String id_registro) {
		this.id_registro = id_registro;
	}
	public Integer getTipo_docu() {
		return tipo_docu;
	}
	public void setTipo_docu(Integer tipo_docu) {
		this.tipo_docu = tipo_docu;
	}
	public String getNumero_docu() {
		return numero_docu;
	}
	public void setNumero_docu(String numero_docu) {
		this.numero_docu = numero_docu;
	}
	

}
