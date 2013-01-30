/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvPersonaEntity.java
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
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// @Table(name="cdt_cdv_pers",schema ="SSDC_DS")
@Table(name = "CDT_CDV_PERS")
public class CdvPersonaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private LlaveCompuestaCdvPersona llaveCompuesta;

	@Column(name = "NUM_ESTADO")
	private int status;

	/**
	 * @return the llaveCompuesta
	 */
	public LlaveCompuestaCdvPersona getLlaveCompuesta() {
		return llaveCompuesta;
	}

	/**
	 * @param llaveCompuesta
	 *            the llaveCompuesta to set
	 */
	public void setLlaveCompuesta(LlaveCompuestaCdvPersona llaveCompuesta) {
		this.llaveCompuesta = llaveCompuesta;
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
