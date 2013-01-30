/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompuestaCdv.java
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
public class LlaveCompuestaMediosCdv implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_SERVICIO")
	private ServicioEntity servicio;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_MEDIOS_DIFUSION")
	private MediosDifusionEntity mediosDifusion;

	/**
	 * @return the cveCdv
	 */
	public CdvEntity getCdv() {
		return cdv;
	}

	/**
	 * @param cveCdv
	 *            the cveCdv to set
	 */
	public void setCdv(CdvEntity cdv) {
		this.cdv = cdv;
	}

	/**
	 * @return the cveServicio
	 */
	public ServicioEntity getServicio() {
		return servicio;
	}

	/**
	 * @param cveServicio
	 *            the cveServicio to set
	 */
	public void setServicio(ServicioEntity servicio) {
		this.servicio = servicio;
	}
	
	/**
	 * @return the cveMediosDifusion
	 */
	public MediosDifusionEntity getMediosDifusion() {
		return mediosDifusion;
	}
	/**
	 * @param cveMediosDifusion the cveMediosDifusion to set
	 */
	public void setMediosDifusion(MediosDifusionEntity mediosDifusion) {
		this.mediosDifusion = mediosDifusion;
	}
	
	


}
