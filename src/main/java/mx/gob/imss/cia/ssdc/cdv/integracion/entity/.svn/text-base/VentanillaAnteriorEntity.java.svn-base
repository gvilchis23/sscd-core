/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: VentanillaAnteriorEntity.java
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
//@Table(name = "CDC_VENTANILLAS_INTER_ANT", schema = "SSDC_DS")
@Table(name = "CDC_VENTANILLAS_INTER_ANT")
public class VentanillaAnteriorEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CVE_VENTANILLA_INTER_ANT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveVentanillaAnterior;
	
	@Column(name="NOM_NOMBREVENTANILLA")
	private String nombreVentanillaAnterior;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;
	
	@Column(name="NUM_ESTADO")
	private Integer status;
	/**
	 * @return the cveVentanillaAnterior
	 */
	public Long getCveVentanillaAnterior() {
		return cveVentanillaAnterior;
	}
	/**
	 * @param cveVentanillaAnterior the cveVentanillaAnterior to set
	 */
	public void setCveVentanillaAnterior(Long cveVentanillaAnterior) {
		this.cveVentanillaAnterior = cveVentanillaAnterior;
	}
	/**
	 * @return the nombreVentanillaAnterior
	 */
	public String getNombreVentanillaAnterior() {
		return nombreVentanillaAnterior;
	}
	/**
	 * @param nombreVentanillaAnterior the nombreVentanillaAnterior to set
	 */
	public void setNombreVentanillaAnterior(String nombreVentanillaAnterior) {
		this.nombreVentanillaAnterior = nombreVentanillaAnterior;
	}
	/**
	 * @return the tipoVentanilla
	 */
	public TipoVentanillaEntity getTipoVentanilla() {
		return tipoVentanilla;
	}
	/**
	 * @param tipoVentanilla the tipoVentanilla to set
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
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
