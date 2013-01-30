/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompServicioProblema.java
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
public class LlaveCompServicioProblema implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_SERVICIO")
	private ServicioEntity servicio;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_PROBLEMA")
	private ProblemaProcesoEntity problematica;

	/**
	 * @return the cdv
	 */
	public CdvEntity getCdv() {
		return cdv;
	}

	/**
	 * @param cdv
	 *            the cdv to set
	 */
	public void setCdv(CdvEntity cdv) {
		this.cdv = cdv;
	}

	/**
	 * @return the problematica
	 */
	public ProblemaProcesoEntity getProblematica() {
		return problematica;
	}

	/**
	 * @param problematica
	 *            the problematica to set
	 */
	public void setProblematica(ProblemaProcesoEntity problematica) {
		this.problematica = problematica;
	}

	/**
	 * @return the servicio
	 */
	public ServicioEntity getServicio() {
		return servicio;
	}

	/**
	 * @param servicio
	 *            the servicio to set
	 */
	public void setServicio(ServicioEntity servicio) {
		this.servicio = servicio;
	}

}
