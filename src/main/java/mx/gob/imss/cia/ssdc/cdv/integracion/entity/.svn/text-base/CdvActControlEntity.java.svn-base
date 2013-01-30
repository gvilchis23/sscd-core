/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvActControlEntity.java
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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDT_CDV_ACT_CONTROL")
public class CdvActControlEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private LlaveCompuestaCdvControl llave;

	@Column(name = "NUM_CUMPLEOBJETIVO")
	private int cumplioObjetivo;

	/**
	 * @return the llave
	 */
	public LlaveCompuestaCdvControl getLlave() {
		return llave;
	}

	/**
	 * @param llave
	 *            the llave to set
	 */
	public void setLlave(LlaveCompuestaCdvControl llave) {
		this.llave = llave;
	}

	/**
	 * @return the cumplioObjetivo
	 */
	public int getCumplioObjetivo() {
		return cumplioObjetivo;
	}

	/**
	 * @param cumplioObjetivo
	 *            the cumplioObjetivo to set
	 */
	public void setCumplioObjetivo(int cumplioObjetivo) {
		this.cumplioObjetivo = cumplioObjetivo;
	}

}
