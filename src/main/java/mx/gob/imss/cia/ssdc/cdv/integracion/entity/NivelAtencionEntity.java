/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NivelAtencionEntity.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Equipo de desarrollo
 */

@Entity
//@Table(name = "sst_nivel_atencion", schema = "SSDC_DS")
@Table(name = "sst_nivel_atencion")
public class NivelAtencionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_niv_atencion")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveNivelAtencion;

	@Column(name = "nom_nivel_atencion")
	private String nombreNivelAtencion;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveNivelAtencion
	 */
	public Long getCveNivelAtencion() {
		return cveNivelAtencion;
	}

	/**
	 * @param cveNivelAtencion
	 *            the cveNivelAtencion to set
	 */
	public void setCveNivelAtencion(Long cveNivelAtencion) {
		this.cveNivelAtencion = cveNivelAtencion;
	}

	/**
	 * @return the nombreNivelAtencion
	 */
	public String getNombreNivelAtencion() {
		return nombreNivelAtencion;
	}

	/**
	 * @param nombreNivelAtencion
	 *            the nombreNivelAtencion to set
	 */
	public void setNombreNivelAtencion(String nombreNivelAtencion) {
		this.nombreNivelAtencion = nombreNivelAtencion;
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
