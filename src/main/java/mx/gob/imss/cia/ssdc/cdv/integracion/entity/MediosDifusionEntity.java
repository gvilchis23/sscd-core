/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MediosDifusionEntity.java
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
//@Table(name="cdc_medios_difusion",schema ="SSDC_DS")
@Table(name="cdc_medios_difusion")
public class MediosDifusionEntity  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long cveDifusion;
	private TipoVentanillaEntity tipoVentanilla;
	private String nombreDifusion;
	private Integer status;
	
	@Id
	@Column(name="cve_medios_difusion")
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	/**
	 * @return the cveDifusion
	 */
	public Long getCveDifusion() {
		return cveDifusion;
	}
	/**
	 * @param cveDifusion the cveDifusion to set
	 */
	public void setCveDifusion(Long cveDifusion) {
		this.cveDifusion = cveDifusion;
	}
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cve_tip_ventanilla")
	/**
	 * @return the cveTipoVentanilla
	 */
	public TipoVentanillaEntity getTipoVentanilla() {
		return tipoVentanilla;
	}
	/**
	 * @param cveTipoVentanilla the cveTipoVentanilla to set
	 */
	public void setTipoVentanilla(TipoVentanillaEntity tipoVentanilla) {
		this.tipoVentanilla = tipoVentanilla;
	}
	 @Column(name="nom_medio_difusion")
	/**
	 * @return the nombreDifusion
	 */
	public String getNombreDifusion() {
		return nombreDifusion;
	}
	/**
	 * @param nombreDifusion the nombreDifusion to set
	 */
	public void setNombreDifusion(String nombreDifusion) {
		this.nombreDifusion = nombreDifusion;
	}
	 @Column(name="num_estado")
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
