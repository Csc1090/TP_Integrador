package paquete;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="NOTIFICACION_TECNICO")
public class NotificacionTecnico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_NOTIFICACION_TECNICO")
	private long idNotificacionTecnico;
	
	@Column(name="MENSAJE")
	private String mensaje;
	
	@ManyToOne
	@JoinColumn(name="ID_TECNICO",referencedColumnName="idTecnico")
	private Tecnico tecnico;
	
	public NotificacionTecnico() {}

	public NotificacionTecnico(long idNotificacionTecnico, String mensaje) {
	
		this.idNotificacionTecnico = idNotificacionTecnico;
		this.mensaje = mensaje;
	}
	
	

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public long getIdNotificacionTecnico() {
		return idNotificacionTecnico;
	}

	public void setIdNotificacionTecnico(long idNotificacionTecnico) {
		this.idNotificacionTecnico = idNotificacionTecnico;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "NotificacionTecnico [idNotificacionTecnico=" + idNotificacionTecnico + ", mensaje=" + mensaje + "]";
	}

	
	
	
}
