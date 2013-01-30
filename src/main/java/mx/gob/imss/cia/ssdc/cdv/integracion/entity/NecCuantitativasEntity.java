/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NecCuantitativasEntity.java
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
@Table(name = "CDC_NEC_CUANTITATIVA")
public class NecCuantitativasEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_NEC_CUANTITATIVA")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveNecCuantitativas;

	@Column(name = "NOM_NEC_CUANTITATIVA")
	private String nombreNecCuantitativas;

	@Column(name = "NUM_ESTADO")
	private int status;

	/**
	 * @return the cveNecCuantitativas
	 */
	public Long getCveNecCuantitativas() {
		return cveNecCuantitativas;
	}

	/**
	 * @param cveNecCuantitativas
	 *            the cveNecCuantitativas to set
	 */
	public void setCveNecCuantitativas(Long cveNecCuantitativas) {
		this.cveNecCuantitativas = cveNecCuantitativas;
	}

	/**
	 * @return the nombreNecCuantitativas
	 */
	public String getNombreNecCuantitativas() {
		return nombreNecCuantitativas;
	}

	/**
	 * @param nombreNecCuantitativas
	 *            the nombreNecCuantitativas to set
	 */
	public void setNombreNecCuantitativas(String nombreNecCuantitativas) {
		this.nombreNecCuantitativas = nombreNecCuantitativas;
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
