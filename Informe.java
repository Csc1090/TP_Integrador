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
@Table(name="INFORME")
public class Informe implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_INFORME")
	private long idInforme;
	
	@Column(name="TEC_INC_RESUELTOS")
	private String tecIncResueltos;
	
	@Column(name="TEC_ESPECIALIDAD")
	private String tecEspecialidad;
	
	@Column(name="TEC_RAPIDO")
	private String tecRapido;
	
	@OneToMany(mappedBy="informe",cascade=CascadeType.ALL)
	private List<Tecnico> tecnico=new ArrayList<>();
	
	@OneToMany(mappedBy="informe",cascade=CascadeType.ALL)
	private List<Incidente> incidente=new ArrayList<>();
	
	
	
	public Informe() {}

	public Informe(long idInforme, String tecIncResueltos, String tecEspecialidad, String tecRapido) {
		
		this.idInforme = idInforme;
		this.tecIncResueltos = tecIncResueltos;
		this.tecEspecialidad = tecEspecialidad;
		this.tecRapido = tecRapido;
	}

	
	public List<Tecnico> getTecnico() {
		return tecnico;
	}

	public void setTecnico(List<Tecnico> tecnico) {
		this.tecnico = tecnico;
	}

	public List<Incidente> getIncidente() {
		return incidente;
	}

	public void setIncidente(List<Incidente> incidente) {
		this.incidente = incidente;
	}

	public long getIdInforme() {
		return idInforme;
	}

	public void setIdInforme(long idInforme) {
		this.idInforme = idInforme;
	}

	public String getTecIncResueltos() {
		return tecIncResueltos;
	}

	public void setTecIncResueltos(String tecIncResueltos) {
		this.tecIncResueltos = tecIncResueltos;
	}

	public String getTecEspecialidad() {
		return tecEspecialidad;
	}

	public void setTecEspecialidad(String tecEspecialidad) {
		this.tecEspecialidad = tecEspecialidad;
	}

	public String getTecRapido() {
		return tecRapido;
	}

	public void setTecRapido(String tecRapido) {
		this.tecRapido = tecRapido;
	}

	@Override
	public String toString() {
		return "Informe [idInforme=" + idInforme + ", tecIncResueltos=" + tecIncResueltos + ", tecEspecialidad="
				+ tecEspecialidad + ", tecRapido=" + tecRapido + "]";
	}

	
	
	
}
