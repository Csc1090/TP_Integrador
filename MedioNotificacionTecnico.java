package paquete;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEDIO_NOTIFICACION_TECNICO")
public class MedioNotificacionTecnico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_MEDIO_NOTIFICACION_TECNICO")
	private long idMedioNotificacionTecnico;
	
	private enum notificacionPref{EMAIL,WHATSAPP};
	
	@Column(name="NOTIFICACION_PREF")
	@Enumerated(EnumType.STRING)
	private notificacionPref notificacion;
	
	public MedioNotificacionTecnico(){}

	public MedioNotificacionTecnico(long idMedioNotificacionTecnico,notificacionPref notificacion) {
		
		this.idMedioNotificacionTecnico = idMedioNotificacionTecnico;
		this.notificacion=notificacion;
	}

	
	public notificacionPref getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(notificacionPref notificacion) {
		this.notificacion = notificacion;
	}

	public long getIdMedioNotificacionTecnico() {
		return idMedioNotificacionTecnico;
	}

	public void setIdMedioNotificacionTecnico(long idMedioNotificacionTecnico) {
		this.idMedioNotificacionTecnico = idMedioNotificacionTecnico;
	}

	@Override
	public String toString() {
		return "MedioNotificacionTecnico [idMedioNotificacionTecnico=" + idMedioNotificacionTecnico + "]";
	}
	
	
	
}
