/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: FrecuenciaUsoEntity.java
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
@Table(name = "CDC_FRECUENCIA_USO")
public class FrecuenciaUsoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_FRECUENCIA_USO")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveFrecuenciaUso;

	@Column(name = "NOM_FRECUENCIA_USO")
	private String nombreFrecuenciaUso;

	/**
	 * @return the cveFrecuenciaUso
	 */
	public Long getCveFrecuenciaUso() {
		return cveFrecuenciaUso;
	}

	/**
	 * @param cveFrecuenciaUso
	 *            the cveFrecuenciaUso to set
	 */
	public void setCveFrecuenciaUso(Long cveFrecuenciaUso) {
		this.cveFrecuenciaUso = cveFrecuenciaUso;
	}

	/**
	 * @return the nombreFrecuenciaUso
	 */
	public String getNombreFrecuenciaUso() {
		return nombreFrecuenciaUso;
	}

	/**
	 * @param nombreFrecuenciaUso
	 *            the nombreFrecuenciaUso to set
	 */
	public void setNombreFrecuenciaUso(String nombreFrecuenciaUso) {
		this.nombreFrecuenciaUso = nombreFrecuenciaUso;
	}

}
