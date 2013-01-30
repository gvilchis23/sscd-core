/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonaPropiaEntity.java
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

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@Entity
// @Table(name="cdt_persona_prop_info",schema ="SSDC_DS")
@Table(name = "cdt_persona_prop_info")
public class PersonaPropiaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_persona")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cvePersona;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_puesto")
	private PuestoEntity puesto;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_categoria")
	private CatServicioEntity catServicio;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_unidad")
	private UnidadEntity unidad;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "nom_apellidop")
	private String apellidoPaterno;

	@Column(name = "nom_apellidom")
	private String apellidoMaterno;

	@Column(name = "nom_nombre")
	private String nombre;

	@Column(name = "num_lada")
	private String lada;

	@Column(name = "num_telefono")
	private String telefono;

	@Column(name = "num_extension")
	private String extension;

	@Column(name = "nom_correoelectronico")
	private String correoElectronico;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cvePersona
	 */
	public Long getCvePersona() {
		return cvePersona;
	}

	/**
	 * @param cvePersona
	 *            the cvePersona to set
	 */
	public void setCvePersona(Long cvePersona) {
		this.cvePersona = cvePersona;
	}

	/**
	 * @return the puesto
	 */
	public PuestoEntity getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto
	 *            the puesto to set
	 */
	public void setPuesto(PuestoEntity puesto) {
		this.puesto = puesto;
	}

	

	public CatServicioEntity getCatServicio() {
		return catServicio;
	}

	public void setCatServicio(CatServicioEntity catServicio) {
		this.catServicio = catServicio;
	}

	/**
	 * @return the unidad
	 */
	public UnidadEntity getUnidad() {
		return unidad;
	}

	/**
	 * @param unidad
	 *            the unidad to set
	 */
	public void setUnidad(UnidadEntity unidad) {
		this.unidad = unidad;
	}

	/**
	 * @return the tipoVentanilla
	 */
	public TipoVentanillaEntity getTipoVentanilla() {
		return tipoVentanilla;
	}

	/**
	 * @param tipoVentanilla
	 *            the tipoVentanilla to set
	 */
	public void setTipoVentanilla(TipoVentanillaEntity tipoVentanilla) {
		this.tipoVentanilla = tipoVentanilla;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
