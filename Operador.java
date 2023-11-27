package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OPERADOR")
public class Operador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_OPERADOR")
	private long idOperador;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="TECNICO_ASIGNADO")
	private String tecnicoAsignado;
	
	@OneToMany(mappedBy="operador",cascade=CascadeType.ALL)
	private List<Incidente> incidente=new ArrayList<>();
	
	@OneToMany(mappedBy="operador",cascade=CascadeType.ALL)
	private List<Servicio> servicio=new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private Tecnico tecnico;
	
	@OneToOne(cascade=CascadeType.ALL)
	private TiempoResolucionOperador tiempoResolucionOperador;
	
	@OneToMany(mappedBy="operador",cascade=CascadeType.ALL)
	private List<ReporteDiario> reporteDiario=new ArrayList<>();
	
	public Operador() {}

	public Operador(long idOperador, String nombre, String tecnicoAsignado) {
		
		this.idOperador = idOperador;
		this.nombre = nombre;
		this.tecnicoAsignado = tecnicoAsignado;
	}

	
	
	public List<ReporteDiario> getReporteDiario() {
		return reporteDiario;
	}

	public void setReporteDiario(List<ReporteDiario> reporteDiario) {
		this.reporteDiario = reporteDiario;
	}

	public TiempoResolucionOperador getTiempoResolucionOperador() {
		return tiempoResolucionOperador;
	}

	public void setTiempoResolucionOperador(TiempoResolucionOperador tiempoResolucionOperador) {
		this.tiempoResolucionOperador = tiempoResolucionOperador;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}

	public List<Incidente> getIncidente() {
		return incidente;
	}

	public void setIncidente(List<Incidente> incidente) {
		this.incidente = incidente;
	}

	public long getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(long idOperador) {
		this.idOperador = idOperador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTecnicoAsignado() {
		return tecnicoAsignado;
	}

	public void setTecnicoAsignado(String tecnicoAsignado) {
		this.tecnicoAsignado = tecnicoAsignado;
	}

	@Override
	public String toString() {
		return "Operador [idOperador=" + idOperador + ", nombre=" + nombre + ", tecnicoAsignado=" + tecnicoAsignado
				+ "]";
	}

	
	
	
}
