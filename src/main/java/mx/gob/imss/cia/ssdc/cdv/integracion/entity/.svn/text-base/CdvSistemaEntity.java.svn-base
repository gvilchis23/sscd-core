/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvSistemaEntity.java
 *
 * Creado:  Oct 17, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDT_SISTEMA_CDV")
public class CdvSistemaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private LlaveCompCdvSistema llave;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_FRECUENCIA_USO")
	private FrecuenciaUsoEntity frecuencia;

	/**
	 * @return the llave
	 */
	public LlaveCompCdvSistema getLlave() {
		return llave;
	}

	/**
	 * @param llave
	 *            the llave to set
	 */
	public void setLlave(LlaveCompCdvSistema llave) {
		this.llave = llave;
	}

	/**
	 * @return the frecuencia
	 */
	public FrecuenciaUsoEntity getFrecuencia() {
		return frecuencia;
	}

	/**
	 * @param frecuencia
	 *            the frecuencia to set
	 */
	public void setFrecuencia(FrecuenciaUsoEntity frecuencia) {
		this.frecuencia = frecuencia;
	}

}
