/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvIndicadorEntity.java
 *
 * Creado:  Oct 14, 2011
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
@Table(name = "CDT_CDV_INDICADOR")
public class CdvIndicadorEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private LlaveCompuestaCdvIndicador llave;

	@Column(name = "NUM_ULTIMO_RESULT_MEDICION")
	private int ultimoResultadoMedicion;

	/**
	 * @return the llave
	 */
	public LlaveCompuestaCdvIndicador getLlave() {
		return llave;
	}

	/**
	 * @param llave
	 *            the llave to set
	 */
	public void setLlave(LlaveCompuestaCdvIndicador llave) {
		this.llave = llave;
	}

	/**
	 * @return the ultimoResultadoMedicion
	 */
	public int getUltimoResultadoMedicion() {
		return ultimoResultadoMedicion;
	}

	/**
	 * @param ultimoResultadoMedicion
	 *            the ultimoResultadoMedicion to set
	 */
	public void setUltimoResultadoMedicion(int ultimoResultadoMedicion) {
		this.ultimoResultadoMedicion = ultimoResultadoMedicion;
	}

}
