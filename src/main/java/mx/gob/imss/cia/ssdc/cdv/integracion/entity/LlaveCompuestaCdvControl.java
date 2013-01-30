/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompuestaCdvControl.java
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
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author propietario
 *
 */

@Embeddable
public class LlaveCompuestaCdvControl implements Serializable {
	
	private static final long serialVersionUID = -173811524995042591L;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_ACT_CONTROL")
    private ActividadControlEntity actividad;

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
	 * @return the actividad
	 */
	public ActividadControlEntity getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadControlEntity actividad) {
		this.actividad = actividad;
	}
	
	

}
