package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="TECNICO_ESPECIALIDAD")
public class TecnicoEspecialidad implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TECNICO_ESPECIALIDAD")
	private long idTecnicoEspecialidad;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	private enum experiencia{PRINCIPIANTE,INTERMEDIO,PROFESIONAL};
	
	@Column(name="EXPERIENCIA")
	@Enumerated(EnumType.STRING)
	private experiencia experiencia;
	
	@ManyToOne
	@JoinColumn(name="ID_TECNICO",referencedColumnName="idTecnico")
	private Tecnico tecnico;
	
	@ManyToOne
	@JoinColumn(name="ID_ESPECIALIDAD",referencedColumnName="idEspecialidad")
	private List<Especialidad> especialidad=new ArrayList<>();
	
	
	public TecnicoEspecialidad() {}

	public TecnicoEspecialidad(long idTecnicoEspecialidad, String nombre,experiencia experiencia) {
		
		this.idTecnicoEspecialidad = idTecnicoEspecialidad;
		this.nombre = nombre;
		this.experiencia=experiencia;
	}
 
	

	public List<Especialidad> getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(List<Especialidad> especialidad) {
		this.especialidad = especialidad;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public experiencia getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(experiencia experiencia) {
		this.experiencia = experiencia;
	}

	public long getIdTecnicoEspecialidad() {
		return idTecnicoEspecialidad;
	}

	public void setIdTecnicoEspecialidad(long idTecnicoEspecialidad) {
		this.idTecnicoEspecialidad = idTecnicoEspecialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "TecnicoEspecialidad [idTecnicoEspecialidad=" + idTecnicoEspecialidad + ", nombre=" + nombre + "]";
	}

	
	
	
}
