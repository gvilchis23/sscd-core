/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: InfraestructuraEntity.java
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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDT_INFRAESTRUCTURA")
public class InfraestructuraEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_INFRAESTRUCTURA")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveInfraestructura;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;
	@Column(name = "NUM_AREATRABAJO_ILUM")
	private Integer iluminada;
	@Column(name = "NUM_AREATRABAJO_VENT")
	private Integer ventilada;
	@Column(name = "NUM_AREATRABAJO_LIMP")
	private Integer limpia;
	@Column(name = "NUM_AREATRABAJO_SENIAL")
	private Integer senal;
	@Column(name = "NUM_AREAESPERA_FILA")
	private Integer esperaFila;
	@Column(name = "NUM_AREAESPERA_ILUM")
	private Integer esperaIluminada;
	@Column(name = "NUM_AREAESPERA_VENT")
	private Integer esperaVentilada;
	@Column(name = "NUM_AREAESPERA_LIMP")
	private Integer esperaLimpia;
	@Column(name = "NUM_AREAESPERA_SENIAL")
	private Integer esperaSenal;
	@Column(name = "NUM_NODOS")
	private Integer nodos;
	@Column(name = "NUM_NODOS_ACTIVOS")
	private Integer nodosActivos;
	@Column(name = "NUM_NODOS_INACTIVOS")
	private Integer nodosInactivos;

	/**
	 * @return the cveInfraestructura
	 */
	public Long getCveInfraestructura() {
		return cveInfraestructura;
	}

	/**
	 * @param cveInfraestructura
	 *            the cveInfraestructura to set
	 */
	public void setCveInfraestructura(Long cveInfraestructura) {
		this.cveInfraestructura = cveInfraestructura;
	}

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
	 * @return the iluminada
	 */
	public Integer getIluminada() {
		return iluminada;
	}

	/**
	 * @param iluminada
	 *            the iluminada to set
	 */
	public void setIluminada(Integer iluminada) {
		this.iluminada = iluminada;
	}

	/**
	 * @return the ventilada
	 */
	public Integer getVentilada() {
		return ventilada;
	}

	/**
	 * @param ventilada
	 *            the ventilada to set
	 */
	public void setVentilada(Integer ventilada) {
		this.ventilada = ventilada;
	}

	/**
	 * @return the limpia
	 */
	public Integer getLimpia() {
		return limpia;
	}

	/**
	 * @param limpia
	 *            the limpia to set
	 */
	public void setLimpia(Integer limpia) {
		this.limpia = limpia;
	}

	/**
	 * @return the senal
	 */
	public Integer getSenal() {
		return senal;
	}

	/**
	 * @param senal
	 *            the senal to set
	 */
	public void setSenal(Integer senal) {
		this.senal = senal;
	}

	/**
	 * @return the esperaFila
	 */
	public Integer getEsperaFila() {
		return esperaFila;
	}

	/**
	 * @param esperaFila
	 *            the esperaFila to set
	 */
	public void setEsperaFila(Integer esperaFila) {
		this.esperaFila = esperaFila;
	}

	/**
	 * @return the esperaIluminada
	 */
	public Integer getEsperaIluminada() {
		return esperaIluminada;
	}

	/**
	 * @param esperaIluminada
	 *            the esperaIluminada to set
	 */
	public void setEsperaIluminada(Integer esperaIluminada) {
		this.esperaIluminada = esperaIluminada;
	}

	/**
	 * @return the esperaVentilada
	 */
	public Integer getEsperaVentilada() {
		return esperaVentilada;
	}

	/**
	 * @param esperaVentilada
	 *            the esperaVentilada to set
	 */
	public void setEsperaVentilada(Integer esperaVentilada) {
		this.esperaVentilada = esperaVentilada;
	}

	/**
	 * @return the esperaLimpia
	 */
	public Integer getEsperaLimpia() {
		return esperaLimpia;
	}

	/**
	 * @param esperaLimpia
	 *            the esperaLimpia to set
	 */
	public void setEsperaLimpia(Integer esperaLimpia) {
		this.esperaLimpia = esperaLimpia;
	}

	/**
	 * @return the esperaSenal
	 */
	public Integer getEsperaSenal() {
		return esperaSenal;
	}

	/**
	 * @param esperaSenal
	 *            the esperaSenal to set
	 */
	public void setEsperaSenal(Integer esperaSenal) {
		this.esperaSenal = esperaSenal;
	}

	/**
	 * @return the nodos
	 */
	public Integer getNodos() {
		return nodos;
	}

	/**
	 * @param nodos
	 *            the nodos to set
	 */
	public void setNodos(Integer nodos) {
		this.nodos = nodos;
	}

	/**
	 * @return the nodosActivos
	 */
	public Integer getNodosActivos() {
		return nodosActivos;
	}

	/**
	 * @param nodosActivos
	 *            the nodosActivos to set
	 */
	public void setNodosActivos(Integer nodosActivos) {
		this.nodosActivos = nodosActivos;
	}

	/**
	 * @return the nodosInactivos
	 */
	public Integer getNodosInactivos() {
		return nodosInactivos;
	}

	/**
	 * @param nodosInactivos
	 *            the nodosInactivos to set
	 */
	public void setNodosInactivos(Integer nodosInactivos) {
		this.nodosInactivos = nodosInactivos;
	}

}
