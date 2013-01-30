/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ObjetivoActControlEntity.java
 *
 * Creado:  Oct 13, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
// @Table(name="cdc_objetivo_act_control",schema ="SSDC_DS")
@Table(name = "cdc_objetivo_act_control")
public class ObjetivoActControlEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_obj_act_control")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveObjActControl;

	@Column(name = "nom_objetivo")
	private String nombreObjActControl;

	/**
	 * @return the cveObjActControl
	 */
	public Long getCveObjActControl() {
		return cveObjActControl;
	}

	/**
	 * @param cveObjActControl
	 *            the cveObjActControl to set
	 */
	public void setCveObjActControl(Long cveObjActControl) {
		this.cveObjActControl = cveObjActControl;
	}

	/**
	 * @return the nombreObjActControl
	 */
	public String getNombreObjActControl() {
		return nombreObjActControl;
	}

	/**
	 * @param nombreObjActControl
	 *            the nombreObjActControl to set
	 */
	public void setNombreObjActControl(String nombreObjActControl) {
		this.nombreObjActControl = nombreObjActControl;
	}

}
