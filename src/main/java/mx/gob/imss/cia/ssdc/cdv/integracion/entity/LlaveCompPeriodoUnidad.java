/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompPeriodoUnidad.java
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
public class LlaveCompPeriodoUnidad implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_PERIODO")
	private PeriodoEntity periodo;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_UNIDAD")
	private UnidadEntity unidad;

	/**
	 * @return the periodo
	 */
	public PeriodoEntity getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(PeriodoEntity periodo) {
		this.periodo = periodo;
	}

	/**
	 * @return the unidad
	 */
	public UnidadEntity getUnidad() {
		return unidad;
	}

	/**
	 * @param unidad the unidad to set
	 */
	public void setUnidad(UnidadEntity unidad) {
		this.unidad = unidad;
	}
	
	

}
