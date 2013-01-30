/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AnioEntity.java
 *
 * Creado:  Oct 17, 2011
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
@Table(name = "SST_ANIO")
public class AnioEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_ANIO")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveAnio;

	@Column(name = "NUM_NOMBRE_ANIO")
	private int numeroNombreAnio;

	/**
	 * @return the cveAnio
	 */
	public Long getCveAnio() {
		return cveAnio;
	}

	/**
	 * @param cveAnio
	 *            the cveAnio to set
	 */
	public void setCveAnio(Long cveAnio) {
		this.cveAnio = cveAnio;
	}

	/**
	 * @return the numeroNombreAnio
	 */
	public int getNumeroNombreAnio() {
		return numeroNombreAnio;
	}

	/**
	 * @param numeroNombreAnio
	 *            the numeroNombreAnio to set
	 */
	public void setNumeroNombreAnio(int numeroNombreAnio) {
		this.numeroNombreAnio = numeroNombreAnio;
	}

}
