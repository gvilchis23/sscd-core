/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompCdvSistema.java
 *
 * Creado:  Oct 17, 2011
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
public class LlaveCompCdvSistema implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_SISTEMA")
    private SistemaEntity sistema;

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
	 * @return the sistema
	 */
	public SistemaEntity getSistema() {
		return sistema;
	}

	/**
	 * @param sistema the sistema to set
	 */
	public void setSistema(SistemaEntity sistema) {
		this.sistema = sistema;
	}
	
	

}
