/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PeriodoEntity.java
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
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "SST_PERIODO")
public class PeriodoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CVE_PERIODO")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cvePeriodo;

	@Column(name = "NUM_PERIODO")
	private Integer numeroPeriodo;

	@Column(name = "FEC_FECHAINICIO")
	private Date fechaInicio;

	@Column(name = "FEC_FECHAFIN")
	private Date fechaFin;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_PROCARGA")
	private ProcesoCargaEntity procesoCarga;

	@ManyToMany(cascade = CascadeType.ALL, 
				fetch = FetchType.EAGER, 
				mappedBy = "periodo")
	private List<PaavEntity> paav;

	/**
	 * @return the cvePeriodo
	 */
	public Long getCvePeriodo() {
		return cvePeriodo;
	}

	/**
	 * @param cvePeriodo
	 *            the cvePeriodo to set
	 */
	public void setCvePeriodo(Long cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	/**
	 * @return the numeroPeriodo
	 */
	public Integer getNumeroPeriodo() {
		return numeroPeriodo;
	}

	/**
	 * @param numeroPeriodo
	 *            the numeroPeriodo to set
	 */
	public void setNumeroPeriodo(Integer numeroPeriodo) {
		this.numeroPeriodo = numeroPeriodo;
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
	 * @return the procesoCarga
	 */
	public ProcesoCargaEntity getProcesoCarga() {
		return procesoCarga;
	}

	/**
	 * @param procesoCarga
	 *            the procesoCarga to set
	 */
	public void setProcesoCarga(ProcesoCargaEntity procesoCarga) {
		this.procesoCarga = procesoCarga;
	}

	/**
	 * @return the paav
	 */
	public List<PaavEntity> getPaav() {
		return paav;
	}

	/**
	 * @param paav
	 *            the paav to set
	 */
	public void setPaav(List<PaavEntity> paav) {
		this.paav = paav;
	}

}
