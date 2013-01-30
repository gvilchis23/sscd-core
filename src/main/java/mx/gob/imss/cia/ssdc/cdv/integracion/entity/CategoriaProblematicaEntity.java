/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CategoriaProblematica.java
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

@Entity
@Table(name = "CDC_CAT_PROBLEMATICA")
public class CategoriaProblematicaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_CATEGORIA")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveCategoriaProblematica;

	@Column(name = "NOM_CATEGORIA")
	private String nombreCategoriaProblematica;

	@Column(name = "NUM_ESTADO")
	private int status;

	/**
	 * @return the cveCategoriaProblematica
	 */
	public Long getCveCategoriaProblematica() {
		return cveCategoriaProblematica;
	}

	/**
	 * @param cveCategoriaProblematica
	 *            the cveCategoriaProblematica to set
	 */
	public void setCveCategoriaProblematica(Long cveCategoriaProblematica) {
		this.cveCategoriaProblematica = cveCategoriaProblematica;
	}

	/**
	 * @return the nombreCategoriaProblematica
	 */
	public String getNombreCategoriaProblematica() {
		return nombreCategoriaProblematica;
	}

	/**
	 * @param nombreCategoriaProblematica
	 *            the nombreCategoriaProblematica to set
	 */
	public void setNombreCategoriaProblematica(
			String nombreCategoriaProblematica) {
		this.nombreCategoriaProblematica = nombreCategoriaProblematica;
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
