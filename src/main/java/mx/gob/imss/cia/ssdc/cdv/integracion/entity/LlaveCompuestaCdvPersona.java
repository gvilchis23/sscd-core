/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompuestaCdvPersona.java
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
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LlaveCompuestaCdvPersona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cve_persona")
	private PersonaPropiaEntity persona;
	
	/**
	 * @return the cdv
	 */
	public CdvEntity getCdv() {
		return cdv;
	}
	/**
	 * @param cdv the cdv to set
	 */
	public void setCdv(CdvEntity cdv) {
		this.cdv = cdv;
	}
	/**
	 * @return the persona
	 */
	public PersonaPropiaEntity getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonaPropiaEntity persona) {
		this.persona = persona;
	}

}
