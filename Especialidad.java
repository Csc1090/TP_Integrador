package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="ESPECIALIDAD")
public class Especialidad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_ESPECIALIDAD")
	private long idEspecialidad;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="HABILIDADES")
	private String habilidades;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="N_INCIDENTES_RESUELTOS")
	private int nIncidentesResueltos;
	
	@Column(name="N_TEC_INC")
    private String nTecnico;
	
	@ManyToMany
	@JoinColumn(name="ID_TECNICO",referencedColumnName="idTecnico")
	private  List<Tecnico> tecnicos=new ArrayList<>(); 
	
	public Especialidad() {}

	public Especialidad(long idEspecialidad, String nombre, String habilidades, String descripcion) {
		
		this.idEspecialidad = idEspecialidad;
		this.nombre = nombre;
		this.habilidades = habilidades;
		this.descripcion = descripcion;
	}



	public String getnTecnico() {
		return nTecnico;
	}

	public void setnTecnico(String nTecnico) {
		this.nTecnico = nTecnico;
	}

	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}

	public int getnIncidentesResueltos() {
		return nIncidentesResueltos;
	}

	public void setnIncidentesResueltos(int nIncidentesResueltos) {
		this.nIncidentesResueltos = nIncidentesResueltos;
	}

	public long getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", nombre=" + nombre + ", habilidades=" + habilidades
				+ ", descripcion=" + descripcion + "]";
	}

	
	
}
