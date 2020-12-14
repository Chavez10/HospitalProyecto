package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AsigTurnos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_asig_turno;
	@Column
	private String id_horario;
	@Column
	private Integer id_dia;
	@Column
	private String id_registro;
	@Column
	private String mes_anio;
	@Column
	private String estado;
	
	public Integer getId_asig_turno() {
		return id_asig_turno;
	}
	public void setId_asig_turno(Integer id_asig_turno) {
		this.id_asig_turno = id_asig_turno;
	}
	public String getId_horario() {
		return id_horario;
	}
	public void setId_horario(String id_horario) {
		this.id_horario = id_horario;
	}
	public Integer getId_dia() {
		return id_dia;
	}
	public void setId_dia(Integer id_dia) {
		this.id_dia = id_dia;
	}
	public String getId_registro() {
		return id_registro;
	}
	public void setId_registro(String id_registro) {
		this.id_registro = id_registro;
	}
	public String getMes_anio() {
		return mes_anio;
	}
	public void setMes_anio(String mes_anio) {
		this.mes_anio = mes_anio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
