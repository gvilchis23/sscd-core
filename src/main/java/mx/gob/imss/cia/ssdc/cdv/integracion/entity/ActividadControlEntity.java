/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ActividadControlEntity.java
 *
 * Creado:  Oct 13, 2011
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
// @Table(name = "CDC_ACT_CONTROL", schema = "SSDC_DS")
@Table(name = "CDC_ACT_CONTROL")
public class ActividadControlEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_act_control")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveActControl;

	@Column(name = "nom_actividad_control")
	private String nombreActControl;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_obj_act_control")
	private ObjetivoActControlEntity objetivoControl;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveActControl
	 */
	public Long getCveActControl() {
		return cveActControl;
	}

	/**
	 * @param cveActControl
	 *            the cveActControl to set
	 */
	public void setCveActControl(Long cveActControl) {
		this.cveActControl = cveActControl;
	}

	/**
	 * @return the nombreActControl
	 */
	public String getNombreActControl() {
		return nombreActControl;
	}

	/**
	 * @param nombreActControl
	 *            the nombreActControl to set
	 */
	public void setNombreActControl(String nombreActControl) {
		this.nombreActControl = nombreActControl;
	}

	/**
	 * @return the objetivoControl
	 */
	public ObjetivoActControlEntity getObjetivoControl() {
		return objetivoControl;
	}

	/**
	 * @param objetivoControl
	 *            the objetivoControl to set
	 */
	public void setObjetivoControl(ObjetivoActControlEntity objetivoControl) {
		this.objetivoControl = objetivoControl;
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
