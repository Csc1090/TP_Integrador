package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROBLEMA_ESPECIALIDAD")
public class ProblemaEspecialidad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_PROBLEMA_ESPECIALIDAD")
	private long idProblemaEspecialidad;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	private enum tipoProblema{SENCILLO,COMPLEJO};
	
	@Column(name="TIPO_PROBLEMA")
	@Enumerated(EnumType.STRING)
	private tipoProblema tipoProblema;
	
	private enum estado{EN_CURSO,RESUELTO};
	
	@Column(name="ESTADO")
	@Enumerated(EnumType.STRING)
	private estado estado;
	
	@OneToMany(mappedBy="ProblemaEspecialidad",cascade=CascadeType.ALL)
	private List<Incidente> incidente=new ArrayList<>();
	
	@OneToMany(mappedBy="ProblemaEspecialidad",cascade=CascadeType.ALL)
	private List<Servicio> servicio=new ArrayList<>();
	
	@OneToMany(mappedBy="ProblemaEspecialidad",cascade=CascadeType.ALL)
	private List<Especialidad> especialidad=new ArrayList<>();
	
	
	public ProblemaEspecialidad() {}

	public ProblemaEspecialidad(long idProblemaEspecialidad, String descripcion,tipoProblema tipoProblema,estado estado) {
		
		this.idProblemaEspecialidad = idProblemaEspecialidad;
		this.descripcion = descripcion;
		this.tipoProblema=tipoProblema;
		this.estado=estado;
	}

	
	
	public List<Incidente> getIncidente() {
		return incidente;
	}

	public void setIncidente(List<Incidente> incidente) {
		this.incidente = incidente;
	}

	public List<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}

	public List<Especialidad> getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(List<Especialidad> especialidad) {
		this.especialidad = especialidad;
	}

	public tipoProblema getTipoProblema() {
		return tipoProblema;
	}

	public void setTipoProblema(tipoProblema tipoProblema) {
		this.tipoProblema = tipoProblema;
	}

	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}

	public long getIdProblemaEspecialidad() {
		return idProblemaEspecialidad;
	}

	public void setIdProblemaEspecialidad(long idProblemaEspecialidad) {
		this.idProblemaEspecialidad = idProblemaEspecialidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "ProblemaEspecialidad [idProblemaEspecialidad=" + idProblemaEspecialidad + ", descripcion=" + descripcion
				+ "]";
	}

	
	
	
}
