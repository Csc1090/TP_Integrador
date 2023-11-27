package paquete;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REPORTE_DIARIO")
public class ReporteDiario implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_REPORTE_DIARIO")
	private long idReporteDiario;
	
	@Column(name="CONTENIDO")
	private String contenido;
	
	@Column(name="TECNICO_INVOLUCRADO")
	private String tecnicoInvolucrado;
	
	public ReporteDiario() {}

	public ReporteDiario(long idReporteDiario, String contenido, String tecnicoInvolucrado) {
		
		this.idReporteDiario = idReporteDiario;
		this.contenido = contenido;
		this.tecnicoInvolucrado = tecnicoInvolucrado;
	}

	public long getIdReporteDiario() {
		return idReporteDiario;
	}

	public void setIdReporteDiario(long idReporteDiario) {
		this.idReporteDiario = idReporteDiario;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getTecnicoInvolucrado() {
		return tecnicoInvolucrado;
	}

	public void setTecnicoInvolucrado(String tecnicoInvolucrado) {
		this.tecnicoInvolucrado = tecnicoInvolucrado;
	}

	@Override
	public String toString() {
		return "ReporteDiario [idReporteDiario=" + idReporteDiario + ", contenido=" + contenido
				+ ", tecnicoInvolucrado=" + tecnicoInvolucrado + "]";
	}

	
	
	
}
