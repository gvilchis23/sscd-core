/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompProblAccion.java
 *
 * Creado:  Oct 14, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author propietario
 *
 */

@Embeddable
public class LlaveCompProblAccion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_PROBLEMATICA")
	private ProblematicaEntity problematica;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_ACCION")
    private AccionEntity accion;

	/**
	 * @return the problematica
	 */
	public ProblematicaEntity getProblematica() {
		return problematica;
	}

	/**
	 * @param problematica the problematica to set
	 */
	public void setProblematica(ProblematicaEntity problematica) {
		this.problematica = problematica;
	}

	/**
	 * @return the accion
	 */
	public AccionEntity getAccion() {
		return accion;
	}

	/**
	 * @param accion the accion to set
	 */
	public void setAccion(AccionEntity accion) {
		this.accion = accion;
	}
	
	

}
