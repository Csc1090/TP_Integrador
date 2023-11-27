package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TECNICO")
public class Tecnico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TECNICO")
	private long idTecnico;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="APELLIDO")
	private String apellido;
	
	@Column(name="WHATSAPP")
	private String whatsapp;
	
	@Column(name="N_INCIDENTES_RESUELTOS")
	private int incidentesResueltos;
	
	@OneToMany(mappedBy="tecnico",cascade=CascadeType.ALL)
	private List<Incidente> incidente=new ArrayList<>();
	
	@OneToMany(mappedBy="tecnico",cascade=CascadeType.ALL)
	private List<NotificacionTecnico> notificacion=new ArrayList<>();
	
	public Tecnico() {}

	public Tecnico(long idTecnico, String nombre, String apellido, String whatsapp,int incidentesResueltos) {
		
		this.idTecnico = idTecnico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.whatsapp = whatsapp;
		this.incidentesResueltos=incidentesResueltos;
	}
	
	

	public List<NotificacionTecnico> getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(List<NotificacionTecnico> notificacion) {
		this.notificacion = notificacion;
	}

	public int getIncidentesResueltos() {
		return incidentesResueltos;
	}

	public void setIncidentesResueltos(int incidentesResueltos) {
		this.incidentesResueltos = incidentesResueltos;
	}

	public List<Incidente> getIncidente() {
		return incidente;
	}

	public void setIncidente(List<Incidente> incidente) {
		this.incidente = incidente;
	}

	public long getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(long idTecnico) {
		this.idTecnico = idTecnico;
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

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	@Override
	public String toString() {
		return "Tecnico [idTecnico=" + idTecnico + ", nombre=" + nombre + ", apellido=" + apellido + ", whatsapp="
				+ whatsapp + "]";
	}

	
	
	
}
