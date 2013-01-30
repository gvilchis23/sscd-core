/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvProblCuantiEntity.java
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
@Table(name = "CDT_PRO_NEC_CUANTITATIVA")
public class CdvProblCuantiEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private LlaveCompProblCuanti llave;

	@Column(name = "NUM_ELEMENTOS")
	private Integer numeroElementos;

	/**
	 * @return the llave
	 */
	public LlaveCompProblCuanti getLlave() {
		return llave;
	}

	/**
	 * @param llave
	 *            the llave to set
	 */
	public void setLlave(LlaveCompProblCuanti llave) {
		this.llave = llave;
	}

	/**
	 * @return the numeroElementos
	 */
	public int getNumeroElementos() {
		return numeroElementos;
	}

	/**
	 * @param numeroElementos
	 *            the numeroElementos to set
	 */
	public void setNumeroElementos(int numeroElementos) {
		this.numeroElementos = numeroElementos;
	}

}
