package demo.apirestSpringBoot.apiLatinosTravel.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pasajero")
public class Pasajero {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDPASAJERO")
	private Long idPasajero;
	@Column(name="PRIMERNOMBRE")
	private String primerNombre;
	@Column(name="SEGUNDONOMBRE")
	private String segundoNombre;
	@Column(name="PRIMERAPELLIDO")
	private String primerApellido;
	@Column(name="SEGUNDOAPELLIDO")
	private String segundoApellido;
	@Column(name="TIPO_DOCUMENTO")
	private String tipo_Documento;
	@Column(name="NUM_DOCUMENTO")
	private String num_Documento;
	@Column(name="FECHANACIMIENTO")
	private Date fechaNacimiento;
	@Column(name="IDPAIS")
	private int idPais;
	
	private String telefono;
	
	private String email;
	
	private String clave;

	public Long getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(Long idPasajero) {
		this.idPasajero = idPasajero;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTipo_Documento() {
		return tipo_Documento;
	}

	public void setTipo_Documento(String tipo_Documento) {
		this.tipo_Documento = tipo_Documento;
	}

	public String getNum_Documento() {
		return num_Documento;
	}

	public void setNum_Documento(String num_Documento) {
		this.num_Documento = num_Documento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
