/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonalEntity.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
// @Table(name = "SST_PERSONAL", schema = "SSDC_DS")
@Table(name = "SST_PERSONAL")
public class PersonalEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_personal")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cvePersonal;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_categoria")
	private CategoriaEntity categoria;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_puesto")
	private PuestoEntity puesto;

	@Column(name = "nom_nombre")
	private String nombrePersonal;

	@Column(name = "nom_apellidop")
	private String apellidoPaterno;

	@Column(name = "nom_apellidom")
	private String apellidoMaterno;

	@Column(name = "nom_usuario")
	private String nombreUsuario;

	@Column(name = "nom_contrasenia")
	private String contrasenia;

	@Column(name = "num_lada")
	private String lada;

	@Column(name = "num_telefono")
	private String telefono;

	@Column(name = "num_extension")
	private String extension;

	@Column(name = "nom_correo_electronico")
	private String correoElectronico;

	/**
	 * @return the cvePersonal
	 */
	public Long getCvePersonal() {
		return cvePersonal;
	}

	/**
	 * @param cvePersonal
	 *            the cvePersonal to set
	 */
	public void setCvePersonal(Long cvePersonal) {
		this.cvePersonal = cvePersonal;
	}

	/**
	 * @return the nombrePersonal
	 */
	public String getNombrePersonal() {
		return nombrePersonal;
	}

	/**
	 * @param nombrePersonal
	 *            the nombrePersonal to set
	 */
	public void setNombrePersonal(String nombrePersonal) {
		this.nombrePersonal = nombrePersonal;
	}

	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno
	 *            the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno
	 *            the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario
	 *            the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia
	 *            the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * @return the lada
	 */
	public String getLada() {
		return lada;
	}

	/**
	 * @param lada
	 *            the lada to set
	 */
	public void setLada(String lada) {
		this.lada = lada;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension
	 *            the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico
	 *            the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the cveCategoria
	 */
	public CategoriaEntity getCategoria() {
		return categoria;
	}

	/**
	 * @param cveCategoria
	 *            the cveCategoria to set
	 */
	public void setCategoria(CategoriaEntity cveCategoria) {
		this.categoria = cveCategoria;
	}

	/**
	 * @return the cvePuesto
	 */
	public PuestoEntity getPuesto() {
		return puesto;
	}

	/**
	 * @param cvePuesto
	 *            the cvePuesto to set
	 */
	public void setPuesto(PuestoEntity cvePuesto) {
		this.puesto = cvePuesto;
	}

}
