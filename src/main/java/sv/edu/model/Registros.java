package sv.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registros {
	@Id
	private String id_registro;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String genero;
	@Column
	private String edad;
	@Column
	private String direccion;
	@Column
	private String telefono;
	@Column
	private String email;
	@Column
	private int nacionalidad;
	@Column
	private Integer tipo_dr;
	@Column
	private String jvpm;
	
	
	public String getId_registro() {
		return id_registro;
	}
	public void setId_registro(String id_registro) {
		this.id_registro = id_registro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(int nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public Integer getTipo_dr() {
		return tipo_dr;
	}
	public void setTipo_dr(Integer tipo_dr) {
		this.tipo_dr = tipo_dr;
	}
	public String getJvpm() {
		return jvpm;
	}
	public void setJvpm(String jvpm) {
		this.jvpm = jvpm;
	}
	
	

}
