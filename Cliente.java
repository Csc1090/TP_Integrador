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
@Table(name="CLIENTE")
public class Cliente  implements Serializable{
  
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CLIENTE")
	private long idCliente;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="SERVICIOS_CONTRATADOS")
	private String serviciosContratados;
	
	public enum estado{ALTA,BAJA};
	
	@Column(name="ESTADO")
	@Enumerated(EnumType.STRING)
	private estado estado;
	
	@Column(name="RAZON_SOCIAL")
	private String razonSocial;
	
	@Column(name="CUIL")
	private String cuil;
	
	@OneToMany(mappedBy= "cliente",cascade= CascadeType.ALL)
	private List<Servicio> servicio= new ArrayList<>(); 
	
	@OneToMany(mappedBy="cliente",cascade= CascadeType.ALL)
	private List<Incidente> incidente = new ArrayList<>();
	
	public Cliente() {}

	public Cliente(long idCliente, String nombre, String email, String telefono, String direccion,
			String serviciosContratados, String razonSocial, String cuil) {
		
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.serviciosContratados = serviciosContratados;
		this.razonSocial = razonSocial;
		this.cuil = cuil;
	}
	
	

	public List<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getServiciosContratados() {
		return serviciosContratados;
	}

	public void setServiciosContratados(String serviciosContratados) {
		this.serviciosContratados = serviciosContratados;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", serviciosContratados=" + serviciosContratados + ", razonSocial="
				+ razonSocial + ", cuil=" + cuil + "]";
	}

	
	
	
	
	
}
