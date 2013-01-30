/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: FaseEntity.java
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
@Table(name = "CDC_FASE")
public class FaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_fase")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveFase;

	@Column(name = "nom_fase")
	private String nombreFase;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveFase
	 */
	public Long getCveFase() {
		return cveFase;
	}

	/**
	 * @param cveFase
	 *            the cveFase to set
	 */
	public void setCveFase(Long cveFase) {
		this.cveFase = cveFase;
	}

	/**
	 * @return the nombreFase
	 */
	public String getNombreFase() {
		return nombreFase;
	}

	/**
	 * @param nombreFase
	 *            the nombreFase to set
	 */
	public void setNombreFase(String nombreFase) {
		this.nombreFase = nombreFase;
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
