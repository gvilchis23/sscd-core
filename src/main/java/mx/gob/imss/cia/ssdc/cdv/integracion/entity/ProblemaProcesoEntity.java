/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ProblemaProcesoEntity.java
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 *
 */

@Entity
@Table(name = "CDC_PROBL_PROCESO")
public class ProblemaProcesoEntity  implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_PROBLEMA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveProblemaProceso;
	@Column(name = "NOM_PROBLEMA")
	private String nombreProblemaProceso;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_FASE")
	private FaseEntity fase;
	@Column(name = "NUM_ESTADO")
	private Integer status;
	/**
	 * @return the cveProblemaProceso
	 */
	public Long getCveProblemaProceso() {
		return cveProblemaProceso;
	}
	/**
	 * @param cveProblemaProceso the cveProblemaProceso to set
	 */
	public void setCveProblemaProceso(Long cveProblemaProceso) {
		this.cveProblemaProceso = cveProblemaProceso;
	}
	/**
	 * @return the nombreProblemaProceso
	 */
	public String getNombreProblemaProceso() {
		return nombreProblemaProceso;
	}
	/**
	 * @param nombreProblemaProceso the nombreProblemaProceso to set
	 */
	public void setNombreProblemaProceso(String nombreProblemaProceso) {
		this.nombreProblemaProceso = nombreProblemaProceso;
	}
	/**
	 * @return the fase
	 */
	public FaseEntity getFase() {
		return fase;
	}
	/**
	 * @param fase the fase to set
	 */
	public void setFase(FaseEntity fase) {
		this.fase = fase;
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
