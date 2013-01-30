/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ProcesoCargaEntity.java
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
@Table(name = "SST_PROCESO_CARGA")
public class ProcesoCargaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_PROCARGA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveProcesoCarga;

	@Column(name = "FEC_FECHAINICIO")
	private Date fechaInicio;

	@Column(name = "FEC_FECHAFIN")
	private Date fechaFin;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_TIPOPROCARGA")
	private TipoProcesoCargaEntity tipoCarga;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_ANIO")
	private AnioEntity ano;

	/**
	 * @return the cveProcesoCarga
	 */
	public Long getCveProcesoCarga() {
		return cveProcesoCarga;
	}

	/**
	 * @param cveProcesoCarga
	 *            the cveProcesoCarga to set
	 */
	public void setCveProcesoCarga(Long cveProcesoCarga) {
		this.cveProcesoCarga = cveProcesoCarga;
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

	/**
	 * @return the tipoCarga
	 */
	public TipoProcesoCargaEntity getTipoCarga() {
		return tipoCarga;
	}

	/**
	 * @param tipoCarga
	 *            the tipoCarga to set
	 */
	public void setTipoCarga(TipoProcesoCargaEntity tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	/**
	 * @return the ano
	 */
	public AnioEntity getAno() {
		return ano;
	}

	/**
	 * @param ano
	 *            the ano to set
	 */
	public void setAno(AnioEntity ano) {
		this.ano = ano;
	}

}
