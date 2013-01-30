/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoUnidadEntity.java
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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
// @Table(name = "ssc_tipo_unidad", schema = "SSDC_DS")
@Table(name = "ssc_tipo_unidad")
public class TipoUnidadEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_tipo_unidad")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveTipoUnidad;

	@Column(name = "nom_unidad")
	private String nombreTipoUnidad;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_niv_atencion")
	private NivelAtencionEntity cveNivelAtencion;

	@Column(name = "des_clave")
	private String descripcionClave;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveTipoUnidad
	 */
	public Long getCveTipoUnidad() {
		return cveTipoUnidad;
	}

	/**
	 * @param cveTipoUnidad
	 *            the cveTipoUnidad to set
	 */
	public void setCveTipoUnidad(Long cveTipoUnidad) {
		this.cveTipoUnidad = cveTipoUnidad;
	}

	/**
	 * @return the nombreTipoUnidad
	 */
	public String getNombreTipoUnidad() {
		return nombreTipoUnidad;
	}

	/**
	 * @param nombreTipoUnidad
	 *            the nombreTipoUnidad to set
	 */
	public void setNombreTipoUnidad(String nombreTipoUnidad) {
		this.nombreTipoUnidad = nombreTipoUnidad;
	}

	/**
	 * @return the cveNivelAtencion
	 */
	public NivelAtencionEntity getCveNivelAtencion() {
		return cveNivelAtencion;
	}

	/**
	 * @param cveNivelAtencion
	 *            the cveNivelAtencion to set
	 */
	public void setCveNivelAtencion(NivelAtencionEntity cveNivelAtencion) {
		this.cveNivelAtencion = cveNivelAtencion;
	}

	/**
	 * @return the descripcionClave
	 */
	public String getDescripcionClave() {
		return descripcionClave;
	}

	/**
	 * @param descripcionClave
	 *            the descripcionClave to set
	 */
	public void setDescripcionClave(String descripcionClave) {
		this.descripcionClave = descripcionClave;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
