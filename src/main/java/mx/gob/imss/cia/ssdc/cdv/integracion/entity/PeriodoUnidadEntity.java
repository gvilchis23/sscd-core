/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PeriodoUnidadEntity.java
 *
 * Creado:  Oct 17, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "SST_PERIODO_UNIDAD")
public class PeriodoUnidadEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private LlaveCompPeriodoUnidad llave;
	@Column(name = "FEC_FECHAINICIO")
	private Date fechaInicio;
	@Column(name = "FEC_FECHAFIN")
	private Date fechaFin;

	/**
	 * @return the llave
	 */
	public LlaveCompPeriodoUnidad getLlave() {
		return llave;
	}

	/**
	 * @param llave
	 *            the llave to set
	 */
	public void setLlave(LlaveCompPeriodoUnidad llave) {
		this.llave = llave;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return new Date(fechaInicio.getTime());
	}

	/**
	 * @param fechaInicio
	 *            the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = (Date) fechaInicio.clone();
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return new Date(fechaFin.getTime());
	}

	/**
	 * @param fechaFin
	 *            the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = (Date) fechaFin.clone();
	}

}
