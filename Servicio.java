package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SERVICIO")
public class Servicio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_SERVICIO")
	private long idServicio;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@OneToMany(mappedBy="servicio",cascade=CascadeType.ALL)
	private List<Incidente> incidente=new ArrayList<>();
	
	@ManyToOne
	private Operador operador;

	
	public Servicio() {}

	public Servicio(long idServicio, String nombre, String descripcion) {
		
		this.idServicio = idServicio;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public List<Incidente> getIncidente() {
		return incidente;
	}

	public void setIncidente(List<Incidente> incidente) {
		this.incidente = incidente;
	}

	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	
	
	
}
