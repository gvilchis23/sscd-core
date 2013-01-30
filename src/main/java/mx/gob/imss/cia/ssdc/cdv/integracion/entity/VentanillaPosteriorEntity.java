/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: VentanillaPosteriorEntity.java
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
// @Table(name = "CDC_VENTANILLAS_INTER_POST", schema = "SSDC_DS")
@Table(name = "CDC_VENTANILLAS_INTER_POST")
public class VentanillaPosteriorEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_VENTANILLA_INTER_POST")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveVentanillaPosterior;

	@Column(name = "NOM_NOMBREVENTANILLA")
	private String nombreVentanillaPosterior;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "NUM_ESTADO")
	private Integer status;

	/**
	 * @return the cveVentanillaPosterior
	 */
	public Long getCveVentanillaPosterior() {
		return cveVentanillaPosterior;
	}

	/**
	 * @param cveVentanillaPosterior
	 *            the cveVentanillaPosterior to set
	 */
	public void setCveVentanillaPosterior(Long cveVentanillaPosterior) {
		this.cveVentanillaPosterior = cveVentanillaPosterior;
	}

	/**
	 * @return the nombreVentanillaAnterior
	 */
	public String getNombreVentanillaPosterior() {
		return nombreVentanillaPosterior;
	}

	/**
	 * @param nombreVentanillaPosterior
	 *            the nombreVentanillaPosterior to set
	 */
	public void setNombreVentanillaPosterior(String nombreVentanillaPosterior) {
		this.nombreVentanillaPosterior = nombreVentanillaPosterior;
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

}
