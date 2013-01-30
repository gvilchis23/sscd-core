/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EscolaridadEntity.java
 *
 * Creado:  Oct 13, 2011
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
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDC_ESCOLARIDAD")
public class EscolaridadEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_escolaridad")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveEscolaridad;

	@Column(name = "nom_escolaridad")
	private String nombreEscolaridad;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveEscolaridad
	 */
	public Long getCveEscolaridad() {
		return cveEscolaridad;
	}

	/**
	 * @param cveEscolaridad
	 *            the cveEscolaridad to set
	 */
	public void setCveEscolaridad(Long cveEscolaridad) {
		this.cveEscolaridad = cveEscolaridad;
	}

	/**
	 * @return the nombreEscolaridad
	 */
	public String getNombreEscolaridad() {
		return nombreEscolaridad;
	}

	/**
	 * @param nombreEscolaridad
	 *            the nombreEscolaridad to set
	 */
	public void setNombreEscolaridad(String nombreEscolaridad) {
		this.nombreEscolaridad = nombreEscolaridad;
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
