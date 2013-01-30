/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RazonEntity.java
 *
 * Creado:  Oct 13, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDC_RAZON")
public class RazonEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_RAZON")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveRazon;

	@Column(name = "NOM_RAZON")
	private String nombreRazon;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "NUM_GUSTO_TRABAJO")
	private Integer gustoTrabajo;

	@Column(name = "NUM_ESTADO")
	private Integer status;

	@Column(name = "NUM_GUSTO")
	private Integer gusto;

	@ManyToMany(cascade = CascadeType.ALL, 
				fetch = FetchType.EAGER, 
				mappedBy = "razon")
	private List<OpinionTrabajadorEntity> trabajador;

	/**
	 * @return the cveRazon
	 */
	public Long getCveRazon() {
		return cveRazon;
	}

	/**
	 * @param cveRazon
	 *            the cveRazon to set
	 */
	public void setCveRazon(Long cveRazon) {
		this.cveRazon = cveRazon;
	}

	/**
	 * @return the nombreRazon
	 */
	public String getNombreRazon() {
		return nombreRazon;
	}

	/**
	 * @param nombreRazon
	 *            the nombreRazon to set
	 */
	public void setNombreRazon(String nombreRazon) {
		this.nombreRazon = nombreRazon;
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
	 * @return the gustoTrabajo
	 */
	public Integer getGustoTrabajo() {
		return gustoTrabajo;
	}

	/**
	 * @param gustoTrabajo
	 *            the gustoTrabajo to set
	 */
	public void setGustoTrabajo(Integer gustoTrabajo) {
		this.gustoTrabajo = gustoTrabajo;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the gusto
	 */
	public Integer getGusto() {
		return gusto;
	}

	/**
	 * @param gusto
	 *            the gusto to set
	 */
	public void setGusto(Integer gusto) {
		this.gusto = gusto;
	}

	/**
	 * @return the trabajador
	 */
	public List<OpinionTrabajadorEntity> getTrabajador() {
		return trabajador;
	}

	/**
	 * @param trabajador
	 *            the trabajador to set
	 */
	public void setTrabajador(List<OpinionTrabajadorEntity> trabajador) {
		this.trabajador = trabajador;
	}

}
