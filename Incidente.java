package paquete;

import java.io.Serializable;

import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INCIDENTE")
public class Incidente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_INCIDENTE")
	private long idIncidente;
	
	@Column(name="TIPO_PROBLEMA")
	private String tipoProblema;
	
	private enum estado{EN_PROCESO,RESUELTO};
	
	@Column(name="ESTADO")
	@Enumerated(EnumType.STRING)
	private estado estado;
	
	@Column(name="FECHA_REPORTE")
	private Date fechaReporte;
	
	@Column(name="FECHA_RESOLUCION")
	private Date fechaResolucion;
	
	@Column(name="CLIENTE_ASOCIADO")
	private String clienteAsociado;
	
	@Column(name="SERVICIO_RELACIONADO")
	private String servicioRelacionado;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="TIEMPO")
	private double tiempo;
	
	@Column(name="TECNICO_ASIGNADO")
	private String tecnicoAsignado;
	
	@Column(name="ESPECIALIDAD")
	private String especialidad;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="ID_TECNICO",referencedColumnName="idTecnico")
	private  Tecnico tecnico; 
	
	@ManyToOne
	@JoinColumn(name="ID_SERVICIO",referencedColumnName="idServicio")
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="ID_OPERADOR",referencedColumnName="idOperador")
	private Operador operador;
	
	public Incidente() {}

	public Incidente(long idIncidente, String tipoProblema,estado estado, Date fechaReporte, Date fechaResolucion,
			String clienteAsociado, String servicioRelacionado, String descripcion, double tiempo,
			String tecnicoAsignado, String especialidad) {
		
		this.idIncidente = idIncidente;
		this.tipoProblema = tipoProblema;
		this.estado=estado;
		this.fechaReporte = fechaReporte;
		this.fechaResolucion = fechaResolucion;
		this.clienteAsociado = clienteAsociado;
		this.servicioRelacionado = servicioRelacionado;
		this.descripcion = descripcion;
		this.tiempo = tiempo;
		this.tecnicoAsignado = tecnicoAsignado;
		this.especialidad = especialidad;
	}

	
	
	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}

	public long getIdIncidente() {
		return idIncidente;
	}

	public void setIdIncidente(long idIncidente) {
		this.idIncidente = idIncidente;
	}

	public String getTipoProblema() {
		return tipoProblema;
	}

	public void setTipoProblema(String tipoProblema) {
		this.tipoProblema = tipoProblema;
	}

	public Date getFechaReporte() {
		return fechaReporte;
	}

	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public Date getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(Date fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	public String getClienteAsociado() {
		return clienteAsociado;
	}

	public void setClienteAsociado(String clienteAsociado) {
		this.clienteAsociado = clienteAsociado;
	}

	public String getServicioRelacionado() {
		return servicioRelacionado;
	}

	public void setServicioRelacionado(String servicioRelacionado) {
		this.servicioRelacionado = servicioRelacionado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public String getTecnicoAsignado() {
		return tecnicoAsignado;
	}

	public void setTecnicoAsignado(String tecnicoAsignado) {
		this.tecnicoAsignado = tecnicoAsignado;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Incidente [idIncidente=" + idIncidente + ", tipoProblema=" + tipoProblema + ", fechaReporte="
				+ fechaReporte + ", fechaResolucion=" + fechaResolucion + ", clienteAsociado=" + clienteAsociado
				+ ", servicioRelacionado=" + servicioRelacionado + ", descripcion=" + descripcion + ", tiempo=" + tiempo
				+ ", tecnicoAsignado=" + tecnicoAsignado + ", especialidad=" + especialidad + "]";
	}

	
	
	
}
