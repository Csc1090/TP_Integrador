package paquete;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIEMPO_RESOLUCION_OPERADOR")
public class TiempoResolucionOperador implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIEMPO_RESOLUCION_OPERADOR")
	private long idTiempoResolucionOperador;
	
	@Column(name="INICIO")
	private Date inicio;
	
	@Column(name="FINALIZADO")
	private Date finalizado;
	
	public TiempoResolucionOperador(){}

	public TiempoResolucionOperador(long idTiempoResolucionOperador, Date inicio, Date finalizado) {
		
		this.idTiempoResolucionOperador = idTiempoResolucionOperador;
		this.inicio = inicio;
		this.finalizado = finalizado;
	}

	public long getIdTiempoResolucionOperador() {
		return idTiempoResolucionOperador;
	}

	public void setIdTiempoResolucionOperador(long idTiempoResolucionOperador) {
		this.idTiempoResolucionOperador = idTiempoResolucionOperador;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Date finalizado) {
		this.finalizado = finalizado;
	}

	@Override
	public String toString() {
		return "TiempoResolucionOperador [idTiempoResolucionOperador=" + idTiempoResolucionOperador + ", inicio="
				+ inicio + ", finalizado=" + finalizado + "]";
	}

	
	
	
	
}
